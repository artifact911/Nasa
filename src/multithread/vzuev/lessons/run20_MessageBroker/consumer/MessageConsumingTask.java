package multithread.vzuev.lessons.run20_MessageBroker.consumer;


import multithread.vzuev.lessons.run20_MessageBroker.broker.MessageBroker;
import multithread.vzuev.lessons.run20_MessageBroker.model.Message;

import java.util.Optional;

public final class MessageConsumingTask implements Runnable {

    private final MessageBroker messageBroker;
    private final int minimalAmountMessagesToConsume;
    private final String name;

    public MessageConsumingTask(MessageBroker messageBroker,
                                int minimalAmountMessagesToConsume,
                                String name) {
        this.messageBroker = messageBroker;
        this.minimalAmountMessagesToConsume = minimalAmountMessagesToConsume;
        this.name = name;
    }

    public int getMinimalAmountMessagesToConsume() {
        return minimalAmountMessagesToConsume;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            Optional<Message> consumed = messageBroker.consume(this);
            consumed.orElseThrow(MessageConsumingException::new);
        }
    }
}
