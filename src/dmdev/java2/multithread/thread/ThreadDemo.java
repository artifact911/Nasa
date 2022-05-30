package dmdev.java2.multithread.thread;

import dmdev.java2.multithread.thread.runnable.SimpleRunnable;
import dmdev.java2.multithread.thread.threadclass.SimpleThread;

public class ThreadDemo {

    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        // узнаем состояние потока
        Thread.State state = simpleThread.getState();
        System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
        var runnableThread = new Thread(new SimpleRunnable(), "My name");
        var lambdaThread = new Thread(() -> System.out.println("Hello from lambda: " + Thread.currentThread().getName()));

        // не run()!!!
        simpleThread.start();
        System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
        runnableThread.start();
        lambdaThread.start();
        try {
            // этот метод говорит, что нужно завершить все действия этого потока до того, как мы перейдем к другому
            simpleThread.join(100L);
            System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
            runnableThread.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // говорим, мол закрой поток, когда закончишь
        simpleThread.interrupt();

        // узнали название потока main
        System.out.println(Thread.currentThread().getName());
    }
}
