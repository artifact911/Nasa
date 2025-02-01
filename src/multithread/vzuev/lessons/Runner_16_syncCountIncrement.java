package multithread.vzuev.lessons;

import java.util.stream.IntStream;

// Синхронизируем counter++ вынеся в метод и уазав synchronized
public class Runner_16_syncCountIncrement {

    private static int counter = 0;

    private static final int INCREMENT_AMOUNT_FIRST_THREAD = 500;
    private static final int INCREMENT_AMOUNT_SECOND_THREAD = 600;

    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = incrementCounter(INCREMENT_AMOUNT_FIRST_THREAD);
        Thread secondThread = incrementCounter(INCREMENT_AMOUNT_SECOND_THREAD);

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(counter);
    }

    private static Thread incrementCounter(final int increment) {
        return new Thread(() ->
            IntStream.range(0, increment).forEach(i -> increment()));
    }

    private static synchronized void increment() {
        counter++;
    }
}
