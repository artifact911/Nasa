package multithread.vzuev.lessons;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * Два потока инкрементируют один каунтер, еще два другой.
 * Если мы синхронизирует методы, то в этом нет смысла, т.к. захвачен манотор всего класса
 * и всегда может выполняться только один поток.
 *
 * Но мы знаем, что у любого объекта в джаве есть свой монитор и это значит, что мы можем создать любой объект
 * и синхонизироваться по нему.
 */
public class Runner_17_syncMonitor {

    private static int firstCounter = 0;
    private static int secondCounter = 0;

    private static final int INCREMENT_AMOUNT_FIRST_COUNTER = 500;
    private static final int INCREMENT_AMOUNT_SECOND_COUNTER = 600;

    private static final Object LOCK_TO_INCREMENT_FIRST_COUNTER = new Object();
    private static final Object LOCK_TO_INCREMENT_SECOND_COUNTER = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = createIncrementCounterThread(INCREMENT_AMOUNT_FIRST_COUNTER,
                i -> incrementFirstCounter());
        Thread secondThread = createIncrementCounterThread(INCREMENT_AMOUNT_FIRST_COUNTER,
                i -> incrementFirstCounter());

        Thread thirdThread = createIncrementCounterThread(INCREMENT_AMOUNT_SECOND_COUNTER,
                i -> incrementSecondCounter());
        Thread fourthThread = createIncrementCounterThread(INCREMENT_AMOUNT_SECOND_COUNTER,
                i -> incrementSecondCounter());

    startTreads(firstThread, secondThread, thirdThread, fourthThread);

    waitUntilAreCompleted(firstThread, secondThread, thirdThread, fourthThread);


        System.out.println(firstCounter);
        System.out.println(secondCounter);
    }

    private static Thread createIncrementCounterThread(final int incrementAmount,
                                                       final IntConsumer incrementOperation) {
        return new Thread(() ->
            IntStream.range(0, incrementAmount).forEach(incrementOperation));
    }

    private static void startTreads(final Thread... threads) {
        Arrays.stream(threads).forEach(Thread::start);
    }

    private static void waitUntilAreCompleted(final Thread... threads) {
        Arrays.stream(threads).forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }

    private static void incrementFirstCounter() {
        synchronized (LOCK_TO_INCREMENT_FIRST_COUNTER) {
            firstCounter++;
        }
    }

    private static synchronized void incrementSecondCounter() {
        synchronized (LOCK_TO_INCREMENT_SECOND_COUNTER) {
            secondCounter++;
        }
    }
}
