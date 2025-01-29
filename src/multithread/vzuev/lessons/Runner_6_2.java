package multithread.vzuev.lessons;

public class Runner_6_2 {
    public static void main(String[] args) {

        // т.к. Runnable функциональный, значит можно представить его лямбдой
        // реализовали метод run() из интерфейса
        final Runnable task = () -> System.out.println(Thread.currentThread().getName());

        // Поток может получать задачу в виде Runnable
        // передали задачу для исполнения в потоке
        final Thread thread = new Thread(task);

        // запустили поток и он внутри себя будет выполнять полученный Runnable
        thread.start();

        // выводится имя потока НЕmain, т.к. выполнялось не в нем, а в созданном в main новом потоке
        // подчеркиваем, если thread.start(); закомментить, то ничего не произойдет, т.к. поток thread не стартанет
    }
}
