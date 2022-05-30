package dmdev.java2.multithread.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    /**
     * позволяют безопасно работать в многопоточной среде
     */

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        int value = atomicInteger.incrementAndGet();
        System.out.println(value);

        int newValue = atomicInteger.addAndGet(20);
        System.out.println(newValue);
    }
}
