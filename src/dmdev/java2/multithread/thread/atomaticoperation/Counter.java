package dmdev.java2.multithread.thread.atomaticoperation;

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

    private static String description;
    private int count;

    public static void init() {
        synchronized (Counter.class) {
            if(description == null) {
                description = "Test description";
            }
        }
     }

    public void increment() {
        synchronized(this) {
            count++;
        }
    }
    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
