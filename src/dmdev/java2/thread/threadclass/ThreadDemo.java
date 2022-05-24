package dmdev.java2.thread.threadclass;

public class ThreadDemo {

    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
        try {
            // этот метод говорит, что нужно завершить все действия этого объекта до того, как мы перейдем к другому потоку
            simpleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // говорим, мол закрой поток, когда закончишь
        simpleThread.interrupt();

        // узнали название потока main
        System.out.println(Thread.currentThread().getName());


    }
}
