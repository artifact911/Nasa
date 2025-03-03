package multithread.vzuev.lessons.run31_Livelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Запускаем и получаем Livelock, описанный в info
 */
public class Runner_31 {
    public static void main(String[] args) throws InterruptedException {
        final Lock firstGivenLock = new ReentrantLock();
        final Lock secondGivenLock = new ReentrantLock();

        final Thread firstGivenThread = new Thread(new TaskDeadlock(firstGivenLock, secondGivenLock));
        final Thread secondGivenThread = new Thread(new TaskDeadlock(secondGivenLock, firstGivenLock));

        firstGivenThread.start();
        secondGivenThread.start();
    }
}
