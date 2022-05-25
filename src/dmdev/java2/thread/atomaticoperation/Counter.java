package dmdev.java2.thread.atomaticoperation;

/**
 * 1. Создать класс Counter с одним полем:
 *     private int count;
 *
 *     Добавить методы:
 *     - getCount();
 *     - increment() - count++;
 *     - decrement() - count--;
 */

public class Counter {
    private int count;

    public void increment() {
        count++;
    }
    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
