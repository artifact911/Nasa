package multithread.vzuev.lessons.run26_27_ReentrantReadWriteLock;

import java.util.OptionalLong;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public abstract class AbstractCounter {
    private long value;

    // быстрый Lock
//    public final long getValue() {
//        final Lock lock = this.readLock();
//        lock.lock();
//        try {
//            return this.value;
//        } finally {
//            lock.unlock();
//        }
//    }

    public final OptionalLong getValue() {
        final Lock lock = this.readLock();
        lock.lock();
        try {
            TimeUnit.SECONDS.sleep(1);
            return OptionalLong.of(this.value);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return OptionalLong.empty();
        } finally {
            lock.unlock();
        }
    }

    public final void increment() {
        final Lock lock = this.readLock();
        lock.lock();
        try {
            this.value++;
        } finally {
            lock.unlock();
        }
    }

    protected abstract Lock readLock();
    protected abstract Lock writeLock();
}
