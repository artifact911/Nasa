package dmdev.java2.multithread.saftycollection.queue;

import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<CashBox> cashBoxes;

    public BuyerThread(BlockingQueue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {


        try {
            CashBox box = cashBoxes.take();
            System.out.println(Thread.currentThread().getName() + " Обслуживается в кассе " + box);
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " Освобождаю кассу " + box);
            cashBoxes.add(box);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

