package multithread.vzuev.lessons;

public class Runner_12 {

    private static final String MSG_EXCEPTION_TEMPLATE = "Exception was thrown with message '%s' in thread '%s'\n";

    public static void main(String[] args) throws InterruptedException {

        // реализовали обработчик через лямбду
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (thread, exception)
                -> System.out.printf (MSG_EXCEPTION_TEMPLATE, exception.getMessage(), thread.getName());

        // set по дефолту на все потоки
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);

        final Thread thread = new Thread(new Task());
        // засетали в поток thread обработчик
//        thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        thread.start();

        final Thread thread1 = new Thread(new Task());
        // засетали в поток thread1 обработчик
//        thread1.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        thread1.start();

    }

    private static class Task implements Runnable {

        @Override
        public void run() {
            throw new RuntimeException("I'm exception from task");
        }
    }
}
