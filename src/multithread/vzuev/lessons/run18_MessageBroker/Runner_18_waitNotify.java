package multithread.vzuev.lessons.run18_MessageBroker;

import multithread.vzuev.lessons.run18_MessageBroker.broker.MessageBroker;
import multithread.vzuev.lessons.run18_MessageBroker.consumer.MessageConsumingTask;
import multithread.vzuev.lessons.run18_MessageBroker.producer.MessageProducingTask;

public class Runner_18_waitNotify {

    public static void main(String[] args) {
        final int brokerMaxStoredMessages = 5;
        final MessageBroker messageBroker = new MessageBroker(brokerMaxStoredMessages);

        final Thread producingThread = new Thread(new MessageProducingTask(messageBroker));
        final Thread cinsumingThread = new Thread(new MessageConsumingTask(messageBroker));

        producingThread.start();
        cinsumingThread.start();
    }
}
