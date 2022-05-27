package dmdev.java2.thread.practice.thread;

import java.util.LinkedList;
import java.util.Queue;

public class TaskDemo {

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();
//        ProducerThread producerThread = new ProducerThread(queue);
//        ConsumerThread consumerThread = new ConsumerThread(queue);

        // чтобы вызвать у них start() перепишем их на Thread.class
        Thread producerThread = new Thread(new ProducerThread(queue));
        Thread consumerThread = new Thread(new ConsumerThread(queue));

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
