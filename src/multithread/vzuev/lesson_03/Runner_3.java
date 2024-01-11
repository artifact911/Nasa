package multithread.vzuev.lesson_03;

import static java.util.stream.IntStream.range;

public class Runner_3 {

    private static final int CREATED_THREADS_AMOUNT = 10;
    public static void main(String[] args) {

        final Runnable taskDisplayThreadName = () -> System.out.println(Thread.currentThread().getName());
        final Runnable taskCreateThreads = () ->
                range(0, CREATED_THREADS_AMOUNT).forEach(i -> startThread(taskDisplayThreadName));

        startThread(taskCreateThreads);
    }

    private static void startThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable);
        thread.start();
    }
}
