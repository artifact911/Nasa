package multithread.vzuev.lessons.run26_27_ReentrantReadWriteLock;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Runner_26_27 {
    public static void main(String[] args) throws InterruptedException {

        // 243716831
        // 54
        testCounter(new CounterGuardedByLock());

        // 8566850
        // 250
//        testCounter(new CounterGuardedByReadWriteLock());
    }

    private static void testCounter(final AbstractCounter counter) throws InterruptedException {
        final int amountOfThreadsGettingValue = 50;

        final ReadingValueTask[] readingValueTasks = createReadingTasks(counter, amountOfThreadsGettingValue);
        final Thread[] readingThreads = mapToThreads(readingValueTasks);

        final Runnable incrementingCounterTask = createIncrementingCounterTask(counter);
        final int amount0fThreadsIncrementingCounter = 2;

        final Thread[] incrementingCounterThreads =
                createThreads(incrementingCounterTask, amount0fThreadsIncrementingCounter);

        startThreads(readingThreads);
        startThreads(incrementingCounterThreads);

        TimeUnit.SECONDS.sleep(5);

        interruptThreads(readingThreads);
        interruptThreads(incrementingCounterThreads);

        waitUntilFinish(readingThreads);

        final long totalAmountOfReads = findTotalAmount0fReads(readingValueTasks);
        System.out.println("Total amount of reads: " + totalAmountOfReads);
    }

    private static ReadingValueTask[] createReadingTasks(AbstractCounter counter, int amount0fTasks) {
        return IntStream.range(0, amount0fTasks)
                .mapToObj(i -> new ReadingValueTask(counter))
                .toArray(ReadingValueTask[]::new);
    }

    private static Thread[] mapToThreads(Runnable[] tasks) {
        return Arrays.stream(tasks)
//                    .map(t -> new Thread(t))
                .map(Thread::new)
                .toArray(Thread[]::new);
    }

    private static Runnable createIncrementingCounterTask(AbstractCounter counter) {
        return () -> {
            while (!Thread.currentThread().isInterrupted()) {
                incrementCounter(counter);
            }
        };
    }

    private static void incrementCounter(final AbstractCounter counter) {
        try {
            counter.increment();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    private static Thread[] createThreads(Runnable runnable, int amountOfThreads) {
        return IntStream.range(0, amountOfThreads)
                .mapToObj(i -> new Thread(runnable))
                .toArray(Thread[]::new);
    }

    private static void startThreads(Thread[] threads) {
        Arrays.stream(threads).forEach(Thread::start);
    }

    private static void interruptThreads(Thread[] threads) {
        Arrays.stream(threads).forEach(Thread::interrupt);
    }

    private static void waitUntilFinish(final Thread[] threads) {
        Arrays.stream(threads).forEach(t -> waitUntilFinish(t));
    }

    private static void waitUntilFinish(final Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static long findTotalAmount0fReads(ReadingValueTask[] tasks) {
        return Arrays.stream(tasks)
                .mapToLong(ReadingValueTask::getAmountOfReads)
                .sum();
    }

    private static final class ReadingValueTask implements Runnable {

        private final AbstractCounter counter;
        private long amountOfReads;

        public ReadingValueTask(AbstractCounter counter) {
            this.counter = counter;
        }

        public long getAmountOfReads() {
            return amountOfReads;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                counter.getValue();
                amountOfReads++;
            }
        }
    }
}
