package org.learn.concurrent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.jupiter.api.Assertions.*;

class LockFreeQueueTest {

    @Test
    @DisplayName("Basic Sequential Operations")
    void testSequential() {
        LockFreeQueue<Integer> queue = new LockFreeQueue<>();

        assertNull(queue.dequeue(), "New queue should be empty");

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertNull(queue.dequeue(), "Queue should be empty again");
    }

    @Test
    @DisplayName("High Contention Producer-Consumer Stress Test")
    void testConcurrentIntegrity() throws InterruptedException {
        final int numThreads = 8;
        final int itemsPerThread = 100_000;
        final int totalItems = numThreads * itemsPerThread;

        LockFreeQueue<Integer> queue = new LockFreeQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads * 2);

        // We use a ConcurrentHashMap as a Set to track that every unique item
        // produced is exactly the same as the items consumed.
        Set<Integer> consumedItems = ConcurrentHashMap.newKeySet();
        AtomicInteger consumedCount = new AtomicInteger(0);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch finishLatch = new CountDownLatch(numThreads * 2);

        // Producers
        for (int i = 0; i < numThreads; i++) {
            final int threadId = i;
            executor.submit(() -> {
                try {
                    startLatch.await(); // Wait for the "Go" signal
                    for (int j = 0; j < itemsPerThread; j++) {
                        // Produce a unique number: (threadId * itemsPerThread) + j
                        queue.enqueue((threadId * itemsPerThread) + j);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    finishLatch.countDown();
                }
            });
        }

        // Consumers
        for (int i = 0; i < numThreads; i++) {
            executor.submit(() -> {
                try {
                    startLatch.await();
                    while (consumedCount.get() < totalItems) {
                        Integer item = queue.dequeue();
                        if (item != null) {
                            if (!consumedItems.add(item)) {
                                fail("Duplicate item detected: " + item);
                            }
                            consumedCount.incrementAndGet();
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    finishLatch.countDown();
                }
            });
        }

        long startTime = System.currentTimeMillis();
        startLatch.countDown(); // Start all threads at once

        if (!finishLatch.await(30, TimeUnit.SECONDS)) {
            fail("Test timed out! Possible deadlock or live-lock.");
        }
        long endTime = System.currentTimeMillis();

        executor.shutdown();

        System.out.println("Stress Test Completed:");
        System.out.println("Total Items: " + consumedCount.get());
        System.out.println("Time Taken: " + (endTime - startTime) + "ms");

        assertEquals(totalItems, consumedCount.get(), "Should have consumed all items");
        assertEquals(totalItems, consumedItems.size(), "All consumed items should be unique");
        assertNull(queue.dequeue(), "Queue should be empty at the end");
    }
}