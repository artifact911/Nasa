package multithread.vzuev.lessons;

import static java.util.stream.IntStream.range;

public class Runner_6_3 {

    private static final int CREATED_THREADS_AMOUNT = 10;
    public static void main(String[] args) {

        // Таска печатать имя потока
        final Runnable taskDisplayThreadName = () -> System.out.println(Thread.currentThread().getName());

        // таска, которая будет внутри себя несколько раз вызывать метод startThread
        // и передавать туда таску taskDisplayThreadName
        final Runnable taskCreateThreads = () ->
                range(0, CREATED_THREADS_AMOUNT).forEach(i -> startThread(taskDisplayThreadName));

        // передаем в метод таску
        startThread(taskCreateThreads);
    }

    // Заходит таска taskCreateThreads
    // Для нее создается поток и она передается в этот поток.
    // поток-0 стартует
    // внутри поток-0 выолняется таска taskCreateThreads - эта таска вызывает метод startThread несколько раз и
    // передает туда таску taskDisplayThreadName
    // в методе на каждый запрос создается поток и в этот поток передается таска taskDisplayThreadName
    // таким образом, на потоке-0 мы вызвали еще несколько потоков с таской taskDisplayThreadName
    // соответсвенно мы увидим имена потоков, у которых была таска и принтом имени. т.е. с потока №1
    // заметим, что потоки могут завершаться совершенно в разное время
    private static void startThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable);
        thread.start();
    }
}
