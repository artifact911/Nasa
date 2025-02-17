package multithread.vzuev.lessons.run20_MessageBroker;

import multithread.vzuev.lessons.run20_MessageBroker.broker.MessageBroker;
import multithread.vzuev.lessons.run20_MessageBroker.consumer.MessageConsumingTask;
import multithread.vzuev.lessons.run20_MessageBroker.producer.MessageFactory;
import multithread.vzuev.lessons.run20_MessageBroker.producer.MessageProducingTask;

import java.util.Arrays;

public class Runner_20_waitNotifyNotifyAll {

    public static void main(String[] args) {
        final int brokerMaxStoredMessages = 1;
        final MessageBroker messageBroker = new MessageBroker(brokerMaxStoredMessages);
        final MessageFactory messageFactory = new MessageFactory();

        final Thread firstProducingThread = new Thread(
                new MessageProducingTask(messageBroker, messageFactory, brokerMaxStoredMessages, "PRODUCER_1"));
        final Thread secondProducingThread = new Thread(
                new MessageProducingTask(messageBroker, messageFactory, 10, "PRODUCER_2"));

        final Thread consumingThread = new Thread(
                new MessageConsumingTask(messageBroker, 0, "CONSUMER_1"));

        startThreads(firstProducingThread,
                secondProducingThread,
                consumingThread);
    }

    private static void startThreads(Thread... threads) {
        Arrays.stream(threads).forEach(Thread::start);
    }
}
