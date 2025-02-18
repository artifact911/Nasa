package multithread.vzuev.lessons.run22_ExtraFunctionLocks;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Runner_22_Extra1 {
    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();

        final int incrementAmount = 10;
        final Thread incrementThread = new Thread(
                createTaskDoingOperationOnCounter(counter, i -> counter.increment(), incrementAmount));

        final int decrementAmount = 10;
        final Thread decrementThread = new Thread(
                createTaskDoingOperationOnCounter(counter, i -> counter.decrement(), decrementAmount));

        startThreads(incrementThread, decrementThread);
        joinThreads(incrementThread, decrementThread);
    }

    private static void startThreads(final Thread... threads) {
        Arrays.stream(threads).forEach(Thread::start);
    }

    private static void joinThreads(final Thread... threads) throws InterruptedException {
        for (Thread thread : threads) {
            thread.join();
        }
    }

    private static Runnable createTaskDoingOperationOnCounter(Counter counter,
                                                              IntConsumer operation,
                                                              int times) {
        return () -> {
            counter.lock();
            try {
                IntStream.range(0, times).forEach(operation);
            } finally {
                counter.unlock();
            }
        };
    }

    private static final class Counter {
        private final Lock lock = new ReentrantLock();
        private int value;

        public void lock() {
            this.lock.lock();
            printMessageWithCurrentThreadNameArgument("Thread '%s' locked counter.\n");
        }

        public void increment() {
            this.value++;
            printMessageWithCurrentThreadNameArgument("Thread '%s' incremented counter.\n");
        }

        public void decrement() {
            this.value--;
            printMessageWithCurrentThreadNameArgument("Thread '%s' decremented counter. \n");
        }

        public void unlock() {
            printMessageWithCurrentThreadNameArgument("Thread '%s' is unlocking counter. \n");
            this.lock.unlock();
        }

        private static void printMessageWithCurrentThreadNameArgument(String message) {
            System.out.printf(message, Thread.currentThread().getName());
        }

        public int getValue() {
            return value;
        }
    }
}
