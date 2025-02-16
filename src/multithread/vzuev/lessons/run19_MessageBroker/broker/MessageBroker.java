package multithread.vzuev.lessons.run19_MessageBroker.broker;

import multithread.vzuev.lessons.run19_MessageBroker.consumer.MessageConsumingTask;
import multithread.vzuev.lessons.run19_MessageBroker.model.Message;
import multithread.vzuev.lessons.run19_MessageBroker.producer.MessageProducingTask;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

public final class MessageBroker {

    private static final String MESSAGE_OF_MESSAGE_IS_PRODUCED =
            "Message '%s' is produced by producer '%s'. Amount of messages before producing: %d\n";
    private static final String MESSAGE_OF_MESSAGE_IS_CONSUMED =
            "Message '%s' is consumed by consumer '%s'. Amount of messages before consuming: %d\n";

    private final Queue<Message> messages;
    private final int maxStoredMessages;

    public MessageBroker(int maxStoredMessages) {
        this.maxStoredMessages = maxStoredMessages;
        messages = new ArrayDeque<>(maxStoredMessages);
    }

    public synchronized void produce(Message message, MessageProducingTask task) {
        try {
            while (!isShouldProduce(task)) {
                wait();
            }
            messages.add(message);
            System.out.printf(MESSAGE_OF_MESSAGE_IS_PRODUCED, message, task.getName(), messages.size() - 1);
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized Optional<Message> consume(MessageConsumingTask task) {
        try {
            while (!isShouldConsume(task)) {
                wait();
            }
            Message poll = messages.poll();
            System.out.printf(MESSAGE_OF_MESSAGE_IS_CONSUMED, poll, task.getName(), messages.size() + 1);
            notify();
            return Optional.ofNullable(poll);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Optional.empty();
        }
    }

    private boolean isShouldProduce(MessageProducingTask task) {
        return messages.size() < maxStoredMessages
                && messages.size() <= task.getMaximalAmountMessagesToProduce();
    }

    private boolean isShouldConsume(MessageConsumingTask task) {
        return !messages.isEmpty() && messages.size() >= task.getMinimalAmountMessagesToConsume();
    }
}
