package multithread.vzuev.lessons.run19_MessageBroker;

import multithread.vzuev.lessons.run19_MessageBroker.consumer.MessageConsumingTask;
import multithread.vzuev.lessons.run19_MessageBroker.producer.MessageFactory;
import multithread.vzuev.lessons.run19_MessageBroker.producer.MessageProducingTask;
import multithread.vzuev.lessons.run19_MessageBroker.broker.MessageBroker;

import java.util.Arrays;

public class Runner_19_practice {

    public static void main(String[] args) {
        final int brokerMaxStoredMessages = 15;
        final MessageBroker messageBroker = new MessageBroker(brokerMaxStoredMessages);
        final MessageFactory messageFactory = new MessageFactory();

        final Thread firstProducingThread = new Thread(
                new MessageProducingTask(messageBroker, messageFactory, brokerMaxStoredMessages, "PRODUCER_1"));
        final Thread secondProducingThread = new Thread(
                new MessageProducingTask(messageBroker, messageFactory, 10, "PRODUCER_2"));
        final Thread thirdProducingThread = new Thread(
                new MessageProducingTask(messageBroker, messageFactory, 5, "PRODUCER_3"));

        final Thread firstConsumingThread = new Thread(
                new MessageConsumingTask(messageBroker, 0, "CONSUMER_1"));
        final Thread secondConsumingThread = new Thread(
                new MessageConsumingTask(messageBroker, 6, "CONSUMER_2"));
        final Thread thirdConsumingThread = new Thread(
                new MessageConsumingTask(messageBroker, 11, "CONSUMER_3"));

        startThreads(firstProducingThread,
                secondProducingThread,
                thirdProducingThread,
                firstConsumingThread,
                secondConsumingThread,
                thirdConsumingThread);
    }

    private static void startThreads(Thread... threads) {
        Arrays.stream(threads).forEach(Thread::start);
    }
}
