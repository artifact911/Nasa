package multithread.vzuev.lessons.run24_Condition;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.stream.Collectors.joining;

/**
 * Создадим некое хранилище, размер которого будем задавать при инициализации
 * Работать будет по принципу LIFO
 * Должно быть потоко-безопастно
 * если хранилище пусто, то поток должен ждать, пока там что-то не появится
 * если хранилище заполнено, то поток ждет, пока освободится место
 */
public final class BoundedBuffer24<T> {

    private final T[] items;
    private int size;
    private final Lock lock;
    private final Condition condition;

    @SuppressWarnings("unchecked")
    public BoundedBuffer24(int capacity) {
        items = (T[]) new Object[capacity];
        lock = new ReentrantLock();
        condition = lock.newCondition();
    }

    public boolean isFull() {
        lock.lock();
        try {
            return size == items.length;
        } finally {
            lock.unlock();
        }
    }

    public boolean isEmpty() {
        lock.lock();
        try {
            return size == 0;
        } finally {
            lock.unlock();
        }
    }

    public void put(T item) {
        lock.lock();
        try {
            while (isFull()) {
                condition.await();
            }
            items[size] = item;
            size++;
            System.out.printf("%s was put in buffer. Result buffer: %s%n", item, this);
            condition.signalAll();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public T take() {
        lock.lock();
        try {
            while (isEmpty()) {
                condition.await();
            }
            T item = items[size - 1];
            size--;
            condition.signalAll();
            return item;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        lock.lock();
        try {
            return "{"
                    + Arrays.stream(items, 0, size)
                    .map(Objects::toString)
                    .collect(joining(","))
                    + "}";
        } finally {
            lock.unlock();
        }
    }
}