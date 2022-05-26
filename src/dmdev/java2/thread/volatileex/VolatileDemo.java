package dmdev.java2.thread.volatileex;

public class VolatileDemo {

    /**
     * volatile говорит не использовать никакую оптимизацию. Т.е. мы не кэшируем значение а читаем его всегда из оперативной памяти
     * работает ТОЛЬКО для примитивных типов и ссылок(содержимое ссылок мы не можем прочитать)
     */
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("still false");
            }
        });
        thread1.start();

        Thread.sleep(5L);

        Thread thread2 = new Thread(() -> {
          flag = true;
            System.out.println("flag is set");
        });
        thread2.start();
    }
}
