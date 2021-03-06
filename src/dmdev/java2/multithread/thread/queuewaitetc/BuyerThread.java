package dmdev.java2.multithread.thread.queuewaitetc;

import java.util.Queue;

public class BuyerThread implements Runnable {

    private final Queue<CashBox> cashBoxes;

    public BuyerThread(Queue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {


        try {

            // ловили ошибку ибо два потока одновременно могли проверить это условие и в последствии забирал поток один
            // захватим монитор объекта
            synchronized (cashBoxes) {
                while (true) {
                    if (!cashBoxes.isEmpty()) {
                        CashBox cashBox = cashBoxes.remove();
                        System.out.println(Thread.currentThread().getName() + " Обслуживается в кассе " + cashBox);

                        // только в синхронизированном блоке/методе
                        cashBoxes.wait(5L);

                        System.out.println(Thread.currentThread().getName() + " Освобождаю кассу " + cashBox);
                        cashBoxes.add(cashBox);
                        // уведомляем ВСЕ другие потоки, что место освободилось
                        cashBoxes.notifyAll();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " Ожидаю свободную кассу");
                        cashBoxes.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

