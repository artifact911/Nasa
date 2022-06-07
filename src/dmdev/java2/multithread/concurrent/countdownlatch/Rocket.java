package dmdev.java2.multithread.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {

    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Ракета готовится к запуску...");
        try {
            countDownLatch.await();
            System.out.println("Пуск!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
