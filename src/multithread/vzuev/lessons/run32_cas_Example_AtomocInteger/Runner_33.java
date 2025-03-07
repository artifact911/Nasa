package multithread.vzuev.lessons.run32_cas_Example_AtomocInteger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Runner_33 {
    public static void main(String[] args) throws InterruptedException {
        final EvenNumberGenerator generator = new EvenNumberGenerator();

        final int taskGenerationCounts = 10000;
        final Runnable generationTask = () -> IntStream.range(0, taskGenerationCounts)
                .forEach(i -> generator.generate());

        final int amountOfGeneratingThreads = 5;
        Thread[] generatingThreads = createThreads(generationTask, amountOfGeneratingThreads);

        startThreads(generatingThreads);

        waitUntilFinish(generatingThreads);

        final int expectedGeneratorValue = taskGenerationCounts * amountOfGeneratingThreads * 2;
        final int actualGeneratorValue = generator.getValue();

        assert actualGeneratorValue == expectedGeneratorValue;
    }

    private static Thread[] createThreads(Runnable task, int amountOfThreads) {
        return IntStream.range(0, amountOfThreads)
                .mapToObj(i -> new Thread(task))
                .toArray(Thread[]::new);
    }

    private static void startThreads(Thread[] threads) {
        Arrays.stream(threads).forEach(Thread::start);
    }

    private static void waitUntilFinish(Thread[] threads) {
        Arrays.stream(threads).forEach(Runner_33::waitUntilFinish);
    }

    private static void waitUntilFinish(Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
