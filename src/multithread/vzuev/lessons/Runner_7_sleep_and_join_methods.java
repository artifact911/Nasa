package multithread.vzuev.lessons;

import java.util.stream.IntStream;

/**
 * Методы sleep() и join()
 *
 * Задача:
 * просуммировать в потоке-1 числа от 1 до 500, а в потоке-2 от 501 до 1000
 * Затем в потоке main сложить результаты двух потоков
 *
 * поток-1 когда посчитает выводит сумму и имя своего потока
 * поток-2 когда посчитает выводит сумму и имя своего потока
 * поток-main складывает результаты потоков и выводи сумму и свое имя в принт
 */
public class Runner_7_sleep_and_join_methods {

    public static final int FROM_NUMBER_FIRST_THREAD = 1;
    public static final int TO_NUMBER_FIRST_THREAD = 500;

    public static final int FROM_NUMBER_SECOND_THREAD = 501;
    public static final int TO_NUMBER_SECOND_THREAD = 1000;

    private static final String TEMPLATE_MSG_THREAD_NAME_AND_NUMBER = "%s : %s\n";
    private static final int TIME_WAITING_IN_MILLIS = 1000;

    public static void main(String[] args) throws InterruptedException {
//       method_1();
//        method_2();
        method_3();
    }

    // Без sleep() и без join()
    // на экране что-то вроде
    //main : 0
    //Thread-0 : 125250
    //Thread-1 : 375250
    // main не ждал результатов выполнения потоков и посчитал сразу их результаты, которые не успели
    // сформироваться и остались - 0. Таким образом main первый вывел результат и свое имя
    // Другие потоки не имеет значения в каком порядке вывелись. Главное, что результата сложения
    // результатов двух потоков нет
    private static void method_1() {
        final TaskSummingNumbers firstTask = startSubTask(FROM_NUMBER_FIRST_THREAD, TO_NUMBER_FIRST_THREAD);
        final TaskSummingNumbers secondTask = startSubTask(FROM_NUMBER_SECOND_THREAD, TO_NUMBER_SECOND_THREAD);
        final int resultNumber = firstTask.getResultNumber() + secondTask.getResultNumber();
        printThreadNameAndNumber(resultNumber);
    }

    // Поставили слиппер на 1 секунду в надежде, что потоки успеют постчитать свое и тогда main это подхватит
    private static void method_2() throws InterruptedException {
        final TaskSummingNumbers firstTask = startSubTask(FROM_NUMBER_FIRST_THREAD, TO_NUMBER_FIRST_THREAD);
        final TaskSummingNumbers secondTask = startSubTask(FROM_NUMBER_SECOND_THREAD, TO_NUMBER_SECOND_THREAD);

        waitForTasksFinished();

        final int resultNumber = firstTask.getResultNumber() + secondTask.getResultNumber();
        printThreadNameAndNumber(resultNumber);
    }

    // c join()
    private static void method_3() throws InterruptedException {
        final TaskSummingNumbers firstTask = new TaskSummingNumbers(FROM_NUMBER_FIRST_THREAD, TO_NUMBER_FIRST_THREAD);
        final Thread firstThread = new Thread(firstTask);
        firstThread.start();

        final TaskSummingNumbers secondTask = new TaskSummingNumbers(FROM_NUMBER_SECOND_THREAD, TO_NUMBER_SECOND_THREAD);
        final Thread secondThread = new Thread(secondTask);
        secondThread.start();

        // тут мы заставим main ждать, пока переданные потоки не будут выполнены. Ведь тут управляет сейчас поток main;
        waitForTasksFinished(firstThread, secondThread);

        final int resultNumber = firstTask.getResultNumber() + secondTask.getResultNumber();
        printThreadNameAndNumber(resultNumber);
    }

    private static TaskSummingNumbers startSubTask(final int fromNumber, final int toNumber) {
        final TaskSummingNumbers subtask = new TaskSummingNumbers(fromNumber, toNumber);
        final Thread thread = new Thread(subtask);
        thread.start();
        return subtask;
    }

    private static void printThreadNameAndNumber(final int number) {
        System.out.printf(TEMPLATE_MSG_THREAD_NAME_AND_NUMBER, Thread.currentThread().getName(), number);
    }

    private static void waitForTasksFinished() throws InterruptedException {
        Thread.sleep(TIME_WAITING_IN_MILLIS);
    }

    private static void waitForTasksFinished(final Thread... threads) throws InterruptedException {
        for (final Thread thread : threads) {
            thread.join();
        }
    }

    private static final class TaskSummingNumbers implements Runnable {

        private static final int INITIAL_VALUE_RESULT_NUMBER = 0;

        private final int fromNumber;
        private final int toNumber;
        private int resultNumber;

        public TaskSummingNumbers(int fromNumber, int toNumber) {
            this.fromNumber = fromNumber;
            this.toNumber = toNumber;
            this.resultNumber = INITIAL_VALUE_RESULT_NUMBER;
        }

        public int getResultNumber() {
            return resultNumber;
        }

        @Override
        public void run() {
            IntStream.rangeClosed(this.fromNumber, this.toNumber).forEach(i -> this.resultNumber += i);
            System.out.println(Thread.currentThread().getName() + " : " + this.resultNumber);
        }
    }
}
