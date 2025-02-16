package multithread.vzuev.lessons.run19_MessageBroker.producer;

import multithread.vzuev.lessons.run19_MessageBroker.broker.MessageBroker;
import multithread.vzuev.lessons.run19_MessageBroker.model.Message;

import java.util.concurrent.TimeUnit;

public final class MessageProducingTask implements Runnable {

    private static final int SECONDS_DURATION_OF_SLEEP_BEFORE_PRODUCING = 3;


    private final MessageBroker messageBroker;
    private final MessageFactory messageFactory;
    private final int maximalAmountMessagesToProduce;
    private final String name;

    public MessageProducingTask(MessageBroker messageBroker,
                                MessageFactory messageFactory,
                                int maximalAmountMessagesToProduce,
                                String name) {
        this.messageBroker = messageBroker;
        this.messageFactory = messageFactory;
        this.maximalAmountMessagesToProduce = maximalAmountMessagesToProduce;
        this.name = name;
    }

    public int getMaximalAmountMessagesToProduce() {
        return maximalAmountMessagesToProduce;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {

        try {
            while (!Thread.currentThread().isInterrupted()) {
                final Message messageProduced = this.messageFactory.create();
                TimeUnit.SECONDS.sleep(SECONDS_DURATION_OF_SLEEP_BEFORE_PRODUCING);
                this.messageBroker.produce(messageProduced, this);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
