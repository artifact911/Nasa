package dmdev.java2.multithread.pool;

import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        // создаст пул из одного единственного потока
        Executors.newSingleThreadExecutor();
        // пул из фиксированного числа потоков
        Executors.newFixedThreadPool(5);
        // создаст столько потов, скоько будет задач. Если будет мало - будет добавлять
        Executors.newCachedThreadPool();

        // выполняет потоки с какой-то задержкой или периодичностью
        Executors.newScheduledThreadPool(3);
        // Создает пулл такого размера, сколько позволяет количество процессоров
        Executors.newWorkStealingPool();
    }
}
