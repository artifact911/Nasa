package multithread.vzuev.lessons.run26_27_ReentrantReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class CounterGuardedByLock extends AbstractCounter {

    private final Lock lock = new ReentrantLock();

    @Override
    protected Lock readLock() {
        return this.lock;
    }

    @Override
    protected Lock writeLock() {
        return this.lock;
    }
}
