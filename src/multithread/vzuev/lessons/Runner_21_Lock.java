package multithread.vzuev.lessons;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Runner_21_Lock {
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

        /**
         * Захватили блокировку
         * в try сделали безопасно дела
         * в finally освободили блокировку
         */
        public int generate() {
            lock.lock();

            try {
                return previousGenerated += 2;
            } finally {
                lock.unlock();
            }
        }
    }
}
