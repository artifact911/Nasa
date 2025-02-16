package multithread.vzuev.lessons.run18_MessageBroker.producer;

import multithread.vzuev.lessons.run18_MessageBroker.broker.MessageBroker;
import multithread.vzuev.lessons.run18_MessageBroker.model.Message;

import java.util.concurrent.TimeUnit;

public final class MessageProducingTask implements Runnable {
    private static final String MESSAGE_OF_MESSAGE_IS_PRODUCED = "Message '%s' is produced\n";
    private static final int SECONDS_DURATION_OF_SLEEP_BEFORE_PRODUCING = 3;


    private final MessageBroker messageBroker;
    private final MessageFactory messageFactory;

    public MessageProducingTask(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
        this.messageFactory = new MessageFactory();
    }

    @Override
    public void run() {

        try {
            while (!Thread.currentThread().isInterrupted()) {
                final Message messageProduced = this.messageFactory.create();
                TimeUnit.SECONDS.sleep(SECONDS_DURATION_OF_SLEEP_BEFORE_PRODUCING);
                this.messageBroker.produce(messageProduced);
                System.out.printf(MESSAGE_OF_MESSAGE_IS_PRODUCED, messageProduced);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static final class MessageFactory {
        private static final int INITIAL_NEXT_MESSAGE_INDEX = 1;
        private static final String TEMPLATE_CREATED_MESSAGE_DATA = "Message#%d";

        private int nextMessageIndex;

        public MessageFactory() {
            this.nextMessageIndex = INITIAL_NEXT_MESSAGE_INDEX;
        }

        public Message create() {
            Message message = new Message(String.format(TEMPLATE_CREATED_MESSAGE_DATA, nextMessageIndex));
            nextMessageIndex++;
            return message;
        }
    }
}
