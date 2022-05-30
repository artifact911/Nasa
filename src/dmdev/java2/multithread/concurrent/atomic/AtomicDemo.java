package dmdev.java2.multithread.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    /**
     * позволяют безопасно работать в многопоточной среде и предоставляют всякие безопасные методы
     */

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        // вместо value++
        int value = atomicInteger.incrementAndGet();
        System.out.println(value);

        // вместо newValue += 20
        int newValue = atomicInteger.addAndGet(20);
        System.out.println(newValue);
    }
}
