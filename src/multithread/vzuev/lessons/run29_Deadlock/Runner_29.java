package multithread.vzuev.lessons.run29_Deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Если Lock передавать в разные потоки в разном порядке, получим deadlock
 */
public class Runner_29 {
    public static void main(String[] args) throws InterruptedException {
        final Lock firstGivenLock = new ReentrantLock();
        final Lock secondGivenLock = new ReentrantLock();

        final Thread firstGivenThread = new Thread(new TaskDeadlock(firstGivenLock, secondGivenLock));
        final Thread secondGivenThread = new Thread(new TaskDeadlock(secondGivenLock, firstGivenLock));

        firstGivenThread.start();
        secondGivenThread.start();
    }
}
