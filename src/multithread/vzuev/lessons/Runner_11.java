package multithread.vzuev.lessons;

import java.util.concurrent.TimeUnit;

public class Runner_11 {

    public static void main(String[] args) throws InterruptedException {

//        task1();
        task2();
    }

    // Запустим бесконечный поток и убедимся, что когда main поток закончил работу, наш поток продожит
    //
    // Сделаем поток thread демоном - thread.setDaemon(true) - Нужно делать ДО старта потока
    // Теперь мы видим, что когда main закончился, то и демон закончил свою работу
    private static void task1() {
        Thread thread = new Thread(new Task());
        thread.setDaemon(true);
        thread.start();


        System.out.println("Thread is daemon: " + thread.isDaemon());

        System.out.println("Main thread finished");
    }

    // Чекаем, что порожденный демоном поток будет тож демоном
    private static void task2() throws InterruptedException {
        Thread firstDaemonThread = new Thread(() -> {
            printNameAndDaemonStatus(Thread.currentThread());
            final Thread secondDaemonThread = new Thread(() -> printNameAndDaemonStatus(Thread.currentThread()));
            secondDaemonThread.start();

            try {
                // джойнимся, чтоб firstDaemonThread дождался выполнения текущего потока secondDaemonThread
                secondDaemonThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // сетаем firstDaemonThread демона
        firstDaemonThread.setDaemon(true);
        firstDaemonThread.start();

        // джойнимся, чтоб main дождался выполнения firstDaemonThread
        firstDaemonThread.join();
    }

    private static void printNameAndDaemonStatus(Thread thread) {
        System.out.println(thread.getName() + " isDaemon: " + thread.isDaemon());
    }

    private static final class Task implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("I'm working");
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
