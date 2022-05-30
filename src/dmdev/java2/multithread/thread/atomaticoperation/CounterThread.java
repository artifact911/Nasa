package dmdev.java2.multithread.thread.atomaticoperation;

/**
 * 2. Создать класс CounterThread c одним полем и конструктором:
 *     private Counter counter;
 *
 *     В методе run этого класса в цикле 300 раз вызвать counter.increment();
 */

public class CounterThread extends Thread{
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            counter.increment();
        }
    }
}
