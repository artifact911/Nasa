package multithread.vzuev.lessons.run28_Volatile;

import java.util.concurrent.TimeUnit;

public class Runner_28 {
    public static void main(String[] args) throws InterruptedException {

        final PrintingTask task = new PrintingTask();
        Thread t1 = new Thread(task);

        t1.start();

        TimeUnit.SECONDS.sleep(3);

        task.setShouldPrint(false);

        System.out.println("Printing should be stopped");
    }
}
