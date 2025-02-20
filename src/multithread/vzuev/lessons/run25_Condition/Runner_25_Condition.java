package multithread.vzuev.lessons.run25_Condition;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Runner_25_Condition {
    public static void main(String[] args) throws InterruptedException {
        final BoundedBuffer25<Integer> boundedBuffer = new BoundedBuffer25<>(5);

        final Runnable producingTask = () -> {
            Stream.iterate(0, i -> i + 1)
                    .forEach(i -> {
                        try {
                            boundedBuffer.put(i);
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    });
        };
        final Thread producingThread = new Thread(producingTask);

        final Runnable consumingTask = () -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    boundedBuffer.take();
                    TimeUnit.SECONDS.sleep(3);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        final Thread consumingThread = new Thread(consumingTask);

        producingThread.start();
        consumingThread.start();
    }
}
