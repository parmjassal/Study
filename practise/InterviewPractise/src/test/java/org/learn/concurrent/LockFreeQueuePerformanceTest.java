package org.learn.concurrent;

import org.junit.jupiter.api.Test;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LockFreeQueuePerformanceTest {

    // --- SHARED CONFIGURATION ---
    final int numProducers = 2;
    final int numConsumers = 2;
    final int itemsPerProducer = 1_000_000;
    final int totalItems = numProducers * itemsPerProducer;


    @Test
    void testJavaConcurrentQueuePerformanceWarm() throws InterruptedException {
        System.out.println("--- TESTING JAVA ConcurrentLinkedQueue ---");
        runTest(new JavaQueueAdapter());
    }

    @Test
    void testCustomQueuePerformance() throws InterruptedException {
        System.out.println("--- TESTING CUSTOM LOCK-FREE QUEUE ---");
        runTest(new LockFreeQueueAdapter());
    }

    private void runTest(QueueWrapper<Integer> queue) throws InterruptedException {
        ExecutorService writePool = Executors.newFixedThreadPool(numProducers);
        ExecutorService readPool = Executors.newFixedThreadPool(numConsumers);
        AtomicInteger consumedCount = new AtomicInteger(0);

        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch producersFinished = new CountDownLatch(numProducers);
        CountDownLatch consumersFinished = new CountDownLatch(numConsumers);

        // Producers
        for (int i = 0; i < numProducers; i++) {
            final int startRange = i * itemsPerProducer;
            writePool.submit(() -> {
                try {
                    startLatch.await();
                    for (int j = 0; j < itemsPerProducer; j++) {
                        queue.enqueue(startRange + j);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    producersFinished.countDown();
                }
            });
        }

        // Consumers
        for (int i = 0; i < numConsumers; i++) {
            readPool.submit(() -> {
                try {
                    startLatch.await();
                    while (consumedCount.get() < totalItems) {
                        Integer item = queue.dequeue();
                        if (item != null) {
                            consumedCount.incrementAndGet();
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    consumersFinished.countDown();
                }
            });
        }

        long globalStart = System.nanoTime();
        startLatch.countDown();

        producersFinished.await();
        long writeEnd = System.nanoTime();

        consumersFinished.await();
        long readEnd = System.nanoTime();

        double writeSeconds = (writeEnd - globalStart) / 1_000_000_000.0;
        double readSeconds = (readEnd - globalStart) / 1_000_000_000.0;

        System.out.printf("Write Throughput: %,.2f ops/sec (%.3fs)%n", totalItems / writeSeconds, writeSeconds);
        System.out.printf("Read Throughput:  %,.2f ops/sec (%.3fs)%n", totalItems / readSeconds, readSeconds);
        System.out.println();

        writePool.shutdown();
        readPool.shutdown();
    }

    // --- ADAPTERS FOR COMPARISON ---
    interface QueueWrapper<T> {
        void enqueue(T item);
        T dequeue();
    }

    class LockFreeQueueAdapter implements QueueWrapper<Integer> {
        private final LockFreeQueue<Integer> q = new LockFreeQueue<>();
        public void enqueue(Integer item) { q.enqueue(item); }
        public Integer dequeue() { return q.dequeue(); }
    }

    class JavaQueueAdapter implements QueueWrapper<Integer> {
        private final ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();
        public void enqueue(Integer item) { q.offer(item); }
        public Integer dequeue() { return q.poll(); }
    }
}