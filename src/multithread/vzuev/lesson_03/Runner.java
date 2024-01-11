package multithread.vzuev.lesson_03;

public class Runner {
    public static void main(String[] args) {
        // 1 получили имя текушего потока
        System.out.println(Thread.currentThread().getName());

        // 3 Запустили новый поток из моего класса.
        // НЕпредпочтительный метод
        final Thread thread = new MyThread();
        thread.start();

        // 4 Создадим при помощи анонимного класса
        // Предпочтительный метод
        final Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        thread1.start();
    }


    // 2 создали свой класс, который стартанут нам новый поток
    private static final class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
