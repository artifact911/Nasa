package multithread.vzuev.lessons.run18_MessageBroker.broker;

import multithread.vzuev.lessons.run18_MessageBroker.model.Message;

import java.util.ArrayDeque;
import java.util.Queue;

public final class MessageBroker {

    private final Queue<Message> messages;
    private final int maxStoredMessages;

    public MessageBroker(int maxStoredMessages) {
        this.maxStoredMessages = maxStoredMessages;
        messages = new ArrayDeque<>(maxStoredMessages);
    }

    public synchronized void produce(Message message) {
        try {
            while (messages.size() >= maxStoredMessages) {
                wait();
            }
            messages.add(message);
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


    }

    public synchronized Message consume() {
        try {
            while (messages.isEmpty()) {
                wait();
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Message poll = messages.poll();
        notify();
        return poll;
    }
}
