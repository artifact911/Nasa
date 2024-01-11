package multithread.vzuev.lesson_03;

public class Runner_2 {
    public static void main(String[] args) {

        // реализовали метод run() из интерфейса
        final Runnable task = () -> System.out.println(Thread.currentThread().getName());

        // передали задачу для исполнения в потоке
        final Thread thread = new Thread(task);

        // запустили поток
        thread.start();
    }
}
