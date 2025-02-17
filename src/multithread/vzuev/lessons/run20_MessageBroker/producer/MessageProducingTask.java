package multithread.vzuev.lessons.run20_MessageBroker.producer;

import multithread.vzuev.lessons.run20_MessageBroker.broker.MessageBroker;
import multithread.vzuev.lessons.run20_MessageBroker.model.Message;

public final class MessageProducingTask implements Runnable {

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
        while (!Thread.currentThread().isInterrupted()) {
            final Message messageProduced = this.messageFactory.create();
            this.messageBroker.produce(messageProduced, this);
        }
    }
}
