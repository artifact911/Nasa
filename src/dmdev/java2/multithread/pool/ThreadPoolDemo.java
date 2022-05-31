package dmdev.java2.multithread.pool;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // создаст пул из одного единственного потока
//        Executors.newSingleThreadExecutor();
        // пул из фиксированного числа потоков
//        Executors.newFixedThreadPool(5);
        // создаст столько потов, скоько будет задач. Если будет мало - будет добавлять
//        Executors.newCachedThreadPool();

        // выполняет потоки с какой-то задержкой или периодичностью
//        Executors.newScheduledThreadPool(3);
        // Создает пулл такого размера, сколько позволяет количество процессоров
//        Executors.newWorkStealingPool();

        test();
        test2();
    }

    private static void test() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        // результат выполнения задачи потоком
        Future<Integer> future = threadPool.submit(() -> {
            // убеждаемся, что callable отработает раньше main
            Thread.sleep(2000L);
            System.out.println("It's callable");
            return 1;
        });

        System.out.println("result: " + future.get());
        // останавливаем потоки
        threadPool.shutdown();
        // остановим когда закончатся все задачи в пуле либо когда пройдет отведенное время
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");
    }

    private static void test2() {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
        // запуск с таймаутом
//        threadPool.schedule(() -> System.out.println("OK!"), 3L, TimeUnit.SECONDS);
        // периодичность укажем. Это не нужно завершать. Коментируем закрытие
        threadPool.scheduleAtFixedRate(() -> System.out.println("OK!"), 2L, 4L, TimeUnit.SECONDS);

//        threadPool.shutdown();
//        threadPool.awaitTermination(1L, TimeUnit.SECONDS);
    }
}
