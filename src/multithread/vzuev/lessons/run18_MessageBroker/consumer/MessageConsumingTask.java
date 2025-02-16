package multithread.vzuev.lessons.run18_MessageBroker.consumer;

import multithread.vzuev.lessons.run18_MessageBroker.broker.MessageBroker;
import multithread.vzuev.lessons.run18_MessageBroker.model.Message;

import java.util.concurrent.TimeUnit;

public final class MessageConsumingTask implements Runnable {

    private static final String MESSAGE_OF_MESSAGE_IS_CONSUMED = "Message '%s' is consumed\n";
    private static final int SECONDS_DURATION_OF_SLEEP_BEFORE_CONSUMING = 1;

    private final MessageBroker messageBroker;

    public MessageConsumingTask(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                TimeUnit.SECONDS.sleep(SECONDS_DURATION_OF_SLEEP_BEFORE_CONSUMING);
                Message consumed = messageBroker.consume();
                System.out.printf(MESSAGE_OF_MESSAGE_IS_CONSUMED, consumed);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
