package multithread.vzuev.lessons;

import java.util.stream.IntStream;

public class Runner_10 {

    private static final String MSG_TEMPLATE_THREAD_NAME = "%s : %d\n";

    public static void main(String[] args) throws InterruptedException {
//        task1();

        task2();

    }

    // Создадим потоки с разными приоритетами и посмотрим, какой будет отрабатывать раньше
    // Ожидаем, что поток с высшим приоритетом отработает раньше
    // но так не случилось, т.к. это все зависит от ОС или еще от чего-то может завистеть
    // поэтому не следует вообще пытаться манипулировать приоритетами и юзать приоритет по умолчанию
    private static void task2() {

        // неявно стартанул поток main с дефотным приоритетом - 5

        // создали поток и установили ему максимальный приоритет
        final Thread thread = new Thread(new Task());
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        // тут мы выводим сообщение, когда закончится поток main, у которго дефолтный приоритет - 5
        System.out.println("Main thread finished");
    }

    private static void task1() {
        // получили инфу о текущем потоке - main : 5
        printNameAndPriority(Thread.currentThread());

        // изменили потоку приоритет
        // получили инфу о текущем потоке - main : 10
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        printNameAndPriority(Thread.currentThread());

        // создали поток из main и запустили в нем печать текущего потока
        // видим, что поток Thread-0 унаследовал приоритет из main
        // Thread-0 : 10
        final Thread thread_0 = new Thread(() -> printNameAndPriority(Thread.currentThread()));
        thread_0.start();
    }

   private static void printNameAndPriority(final Thread thread) {
       System.out.printf(MSG_TEMPLATE_THREAD_NAME, thread.getName(), thread.getPriority());
   }

   private static final class Task implements Runnable {

       @Override
       public void run() {
           IntStream.range(0, 100).forEach(System.out::println);
       }
   }
}
