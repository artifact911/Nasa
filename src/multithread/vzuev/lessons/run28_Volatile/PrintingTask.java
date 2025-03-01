package multithread.vzuev.lessons.run28_Volatile;

import java.util.concurrent.TimeUnit;

public class PrintingTask implements Runnable {

    private volatile boolean shouldPrint = true;

    public void setShouldPrint(boolean shouldPrint) {
        this.shouldPrint = shouldPrint;
    }

    @Override
    public void run() {
        try {
            while (shouldPrint) {
                System.out.println("I'm working");
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
