package multithread.vzuev.lessons.run31_Livelock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class TaskDeadlock implements Runnable {

    private static final String MESSAGE_TEMPLATE_TRY_ACQUIRE_LOCK = "Thread '%s' is trying to acquire lock '%s'\n";
    private static final String MESSAGE_TEMPLATE_SUCCESS_ACQUIRE_LOCK = "Thread '%s' acquired lock '%s'\n";
    private static final String MESSAGE_TEMPLATE_RELEASE_LOCK = "Thread '%s' released lock '%s'\n";

    private static final String NAME_FIRST_LOCK = "firstLock";
    private static final String NAME_SECOND_LOCK = "secondLock";

    private final Lock firstLock;
    private final Lock secondLock;

    public TaskDeadlock(Lock firstLock, Lock secondLock) {
        this.firstLock = firstLock;
        this.secondLock = secondLock;
    }

    @Override
    public void run() {
        final String currentThreadName = Thread.currentThread().getName();
        System.out.printf(MESSAGE_TEMPLATE_TRY_ACQUIRE_LOCK, currentThreadName, NAME_FIRST_LOCK);
        this.firstLock.lock();
        try {
            System.out.printf(MESSAGE_TEMPLATE_SUCCESS_ACQUIRE_LOCK, currentThreadName, NAME_FIRST_LOCK);
            TimeUnit.MILLISECONDS.sleep(50);
            while (!this.tryAcquireSecondLock()) {
                TimeUnit.MILLISECONDS.sleep(50);
                this.firstLock.unlock();
                System.out.printf(MESSAGE_TEMPLATE_RELEASE_LOCK, currentThreadName, NAME_FIRST_LOCK);
                TimeUnit.MILLISECONDS.sleep(50);
                System.out.printf(MESSAGE_TEMPLATE_TRY_ACQUIRE_LOCK, currentThreadName, NAME_FIRST_LOCK);
                this.firstLock.lock();
                System.out.printf(MESSAGE_TEMPLATE_SUCCESS_ACQUIRE_LOCK, currentThreadName, NAME_FIRST_LOCK);
                TimeUnit.MILLISECONDS.sleep(50);
            }
            try {
                System.out.printf(MESSAGE_TEMPLATE_SUCCESS_ACQUIRE_LOCK, currentThreadName, NAME_SECOND_LOCK);
            } finally {
                this.secondLock.unlock();
                System.out.printf(MESSAGE_TEMPLATE_RELEASE_LOCK, currentThreadName, NAME_SECOND_LOCK);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            this.firstLock.unlock();
            System.out.printf(MESSAGE_TEMPLATE_RELEASE_LOCK, currentThreadName, NAME_FIRST_LOCK);
        }
    }

    private boolean tryAcquireSecondLock() {
        final String currentThreadName = Thread.currentThread().getName();
        System.out.printf(MESSAGE_TEMPLATE_TRY_ACQUIRE_LOCK, currentThreadName, NAME_SECOND_LOCK);
        return secondLock.tryLock();
    }
}
