package org.learn.concurrent;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class LockFreeQueue<T> {

    private static class Node<T> {

        static final VarHandle NEXT_HANDLE;

        T item;
        volatile Node<T> next;

        static {
            try {
                NEXT_HANDLE = MethodHandles.lookup().findVarHandle(Node.class
                        ,"next", Node.class);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        Node(T item) {
            this.item = item;
        }
    }

    private static final VarHandle HEAD_HANDLE, TAIL_HANDLE;

    private volatile Node<T> head;
    long p1, p2, p3, p4, p5, p6, p7; // padding
    private volatile Node<T> tail;
    static {
        try {
            HEAD_HANDLE = MethodHandles.lookup().findVarHandle(LockFreeQueue.class
            ,"head", Node.class);
            TAIL_HANDLE = MethodHandles.lookup().findVarHandle(LockFreeQueue.class
                    ,"tail", Node.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    LockFreeQueue() {
        Node<T> dummy = new Node<>(null);
        this.head = dummy;
        this.tail = dummy;
    }


    private boolean cas(VarHandle handle, Object obj, Node<T> expected, Node<T> replaceWith) {
        return handle.compareAndSet(obj, expected, replaceWith);
    }


    public void enqueue(T item) {
        Node<T> newNode = new Node<>((item));
        while(true) {
            Node<T> ctail = tail;
            Node<T> ctailNext = ctail.next;

            if (tail == ctail) {
                if (ctailNext != null) {
                    cas(TAIL_HANDLE, this, ctail, ctailNext);
                } else if (cas(Node.NEXT_HANDLE, ctail, null, newNode)) {
                    cas(TAIL_HANDLE, this, ctail, newNode);
                    return;
                }
            }
        }
    }


    public T dequeue() {
        while(true) {
            Node<T> chead = head;
            Node<T> ctail = tail;
            Node<T> cheadNext = chead.next;

            if (chead == head) {
                if (chead == ctail) {
                    if (cheadNext != null) {
                        cas(TAIL_HANDLE, this, ctail, cheadNext);
                    } else return null;
                } else {
                    T item = cheadNext.item;
                    if (cas(HEAD_HANDLE, this, chead, cheadNext) ) {
                        return item;
                    }
                }
            }
        }
    }

}
