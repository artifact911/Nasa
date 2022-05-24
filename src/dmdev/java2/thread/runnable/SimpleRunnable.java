package dmdev.java2.thread.runnable;

public class SimpleRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from runnable: " + Thread.currentThread().getName());
    }
}
