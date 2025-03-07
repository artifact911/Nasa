package multithread.vzuev.lessons.run32_cas_Example_AtomocInteger;

import java.util.concurrent.atomic.AtomicInteger;

public final class EvenNumberGenerator {

    public static final int GENERATION_DELTA = 2;

    private final AtomicInteger value = new AtomicInteger();


    /**
     * Есть метод AtomicInteger.incrementAndGet(), который инкрементировал бы наш value дважды.
     * Почему не заюзать его дважды вместо нашего value.getAndAdd(GENERATION_DELTA)?
     *
     * Потому что getAndAdd() это атомарная операция внутри нашего метода generate(). Если бы мы дважды
     * заюзали incrementAndGet() - нам метод generate() не является потокобезопасным - в нем мог остановиться поток
     * после выполнения первого инкремента и передать работу следующему - ошибка
     */
    public int generate() {
        return value.getAndAdd(GENERATION_DELTA);
    }

    public int getValue() {
        return value.intValue();
    }
}
