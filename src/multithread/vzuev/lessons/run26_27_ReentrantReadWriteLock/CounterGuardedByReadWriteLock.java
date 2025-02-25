package multithread.vzuev.lessons.run26_27_ReentrantReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class CounterGuardedByReadWriteLock extends AbstractCounter {

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    @Override
    protected Lock readLock() {
        return readLock;
    }

    @Override
    protected Lock writeLock() {
        return writeLock;
    }
}
