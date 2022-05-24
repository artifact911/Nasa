package dmdev.java2.thread;

import dmdev.java2.thread.runnable.SimpleRunnable;
import dmdev.java2.thread.threadclass.SimpleThread;

public class ThreadDemo {

    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        var runnableThread = new Thread(new SimpleRunnable(), "My name");
        var lambdaThread = new Thread(() -> System.out.println("Hello from lambda: " + Thread.currentThread().getName()));

        // не run()!!!
        simpleThread.start();
        runnableThread.start();
        lambdaThread.start();
        try {
            // этот метод говорит, что нужно завершить все действия этого потока до того, как мы перейдем к другому
            simpleThread.join();
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
