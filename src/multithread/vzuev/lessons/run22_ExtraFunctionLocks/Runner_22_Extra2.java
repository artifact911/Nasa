package multithread.vzuev.lessons.run22_ExtraFunctionLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * Перезапустить несколько раз, если надо
 * Должны поймать исключение, когда какой-то поток не смог захватить блокировку
 */
public class Runner_22_Extra2 {
    public static void main(String[] args) {
        final EvenNumberGenerator evenNumberGenerator = new EvenNumberGenerator();

        final Runnable generatingTask = () -> IntStream.range(0, 100)
                .forEach(i -> System.out.println(evenNumberGenerator.generate()));

        final Thread firstThread = new Thread(generatingTask);
        final Thread secondThread = new Thread(generatingTask);
        final Thread thirdThread = new Thread(generatingTask);
        thirdThread.start();
        firstThread.start();
        secondThread.start();

    }

    private static class EvenNumberGenerator {
        private final Lock lock;
        private int previousGenerated;

        public EvenNumberGenerator() {
            this.previousGenerated = -2;
            this.lock = new ReentrantLock();
        }

        public int generate() {
           return lock.tryLock() ? onSuccessAcquireLock() : onFailAcquireLock();
        }

        private int onSuccessAcquireLock() {
            try {
                return previousGenerated += 2;
            } finally {
                lock.unlock();
            }
        }

        private int onFailAcquireLock() {
            System.out.printf("Thread '%s' didn't acquire lock. \n", Thread.currentThread().getName());
            throw new RuntimeException();
        }
    }
}
