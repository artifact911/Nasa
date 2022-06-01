package dmdev.java2.multithread.semaphore;


import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class CashBoxRunner {

    public static void main(String[] args) throws InterruptedException {
        Semaphore cashBoxes = new Semaphore(2);

        List<Thread> threads = Stream.of(
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes),
                                             new BuyerThread(cashBoxes)
                                     )
                                     .map(Thread::new)
                                     .peek(Thread::start).toList();

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
