package multithread.vzuev.lessons;

import java.util.concurrent.ThreadFactory;

public class Runner_13_ThreadFactory {

    private static final String MSG_EXCEPTION_TEMPLATE = "Exception was thrown with message '%s' in thread '%s'\n";

    public static void main(String[] args) throws InterruptedException {
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (thread, exception)
                -> System.out.printf (MSG_EXCEPTION_TEMPLATE, exception.getMessage(), thread.getName());

       ThreadFactory threadFactory = new DaemonThreadWithUncaughtExceptionHandlerFactory(uncaughtExceptionHandler);

        final Thread thread = threadFactory.newThread(new Task());
        thread.start();

        final Thread thread1 = threadFactory.newThread(new Task());
        thread1.start();

        // заджойним на main, чтоб успели выполнится
        thread.join();
        thread1.join();
    }

    private static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread is daemon: " + Thread.currentThread().isDaemon());
            throw new RuntimeException("I'm exception from task");
        }
    }

    public static class DaemonThreadWithUncaughtExceptionHandlerFactory implements ThreadFactory {

        private final Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

        public DaemonThreadWithUncaughtExceptionHandlerFactory(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.uncaughtExceptionHandler = uncaughtExceptionHandler;
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            thread.setDaemon(true);
            return thread;
        }
    }
}
