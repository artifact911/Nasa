package dmdev.java2.multithread.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {

    private final Semaphore cashBoxes;

    public BuyerThread(Semaphore cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {


        try {
            // захвати какой-нибудь монитор
            cashBoxes.acquire();

            System.out.println(Thread.currentThread().getName() + " Обслуживается в какой-то кассе");
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " Освобождаю какую-то кассу");

            // освободи монитор
            cashBoxes.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

