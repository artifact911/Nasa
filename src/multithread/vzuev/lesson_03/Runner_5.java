package multithread.vzuev.lesson_03;

public class Runner_5 {

    private static final String MSG_TEMPLATE_THREAD_STATE = "%s : %s\n";

    public static void main(String[] args) throws InterruptedException {
//        threadNew();
//        threadRunning();
//        threadWaiting();
//        threadTimedWaiting();
        threadTerminated();
    }

    private static void threadNew() {
        // тут понятно, поток новый только создан
        final Thread thread = new Thread();
        showThreadState(thread);

        // тут он тож новый. Этот поток всего лишь получил задачу, а запущен он не был
        final Thread thread1 = new Thread(() -> showThreadState(Thread.currentThread()));
        showThreadState(thread1);
    }

    private static void threadRunning() {
        // тут new
        final Thread thread = new Thread(() -> showThreadState(Thread.currentThread()));

        // и тут все еще new
        showThreadState(thread);

        // тут мы запустили поток и задача в потоке сейчас нам покажет, какое сотояние у потока
        thread.start();
    }

    private static void threadWaiting() throws InterruptedException {
        final Thread mainThread = Thread.currentThread();

        // 1 Просто создали новый поток
        // main уже существует и запущен
        final Thread thread = new Thread(() -> {
            try {

                // 3 main джойним к текущему потоку thread, а значит thread ждет теперь пока main не закончит свой сон
                mainThread.join();
                // 5 main отработал, а текущий поток thread перешел в состояние Thread-0 : RUNNABLE
                showThreadState(Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        // 2 запустили новый поток - thread
        // с этого момента работает 2 потока
        thread.start();
        // 2.1 тут видно, что main : RUNNABLE
        showThreadState(mainThread);

        // 3 поток main засыпает на секунду
        // но thread продолжает работу
        Thread.sleep(1000L);

        // 4 у main прошел слиппер, а у thread ждет main - значит тут состояние потока Thread-0 : WAITING
        showThreadState(thread);
    }

    private static void threadTimedWaiting() throws InterruptedException {
        final Thread mainThread = Thread.currentThread();

        // 1 Просто создали новый поток
        // main уже существует и запущен
        final Thread thread = new Thread(() -> {
            try {

                // 3 main джойним к текущему потоку thread, а значит thread ждет теперь пока main не закончит свой сон
                mainThread.join(2000);
                // 5 main отработал, а текущий поток thread перешел в состояние Thread-0 : RUNNABLE
                showThreadState(Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        // 2 запустили новый поток - thread
        // с этого момента работает 2 потока
        thread.start();

        // 3 поток main засыпает на секунду
        // но thread продолжает работу
        Thread.sleep(1000L);

        // 4 у main прошел слиппер, а у thread ждет main - значит тут состояние потока Thread-0 : WAITING
        showThreadState(thread);
    }

    private static void threadTerminated() throws InterruptedException {
        final Thread thread = new Thread(() -> {
            showThreadState(Thread.currentThread());

            // раскомменти эту строку и закомменти верхнюю и увидишь, как исключение прибивает поток
            // Нужно обратить внимание: что если исключение убъет какой-то поток, другие
            // продолжат работать! - в результате мы увидим в консоле выполение потока main - Thread-0 : TERMINATED
//            throw new RuntimeException();
        });
        thread.start();

        // кто вызывл join() того и будут ждать в потоке, в котором его вызвали - в нашем случае main будет ждать thread
        thread.join();

        // Thread-0 : TERMINATED, т.к. он завершился
        showThreadState(thread);
    }

    private static void showThreadState(final Thread thread) {
        System.out.printf(String.format(MSG_TEMPLATE_THREAD_STATE, thread.getName(), thread.getState()));
    }
}
