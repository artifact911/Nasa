package multithread.vzuev.lessons.run20_MessageBroker.producer;

import multithread.vzuev.lessons.run20_MessageBroker.model.Message;

public class MessageFactory {

    private static final int INITIAL_NEXT_MESSAGE_INDEX = 1;
    private static final String TEMPLATE_CREATED_MESSAGE_DATA = "Message#%d";

    private int nextMessageIndex;

    public MessageFactory() {
        this.nextMessageIndex = INITIAL_NEXT_MESSAGE_INDEX;
    }

    public Message create() {
        return new Message(String.format(TEMPLATE_CREATED_MESSAGE_DATA, findAndIncrementNextMessageIndex()));
    }

    private synchronized int findAndIncrementNextMessageIndex() {
        return this.nextMessageIndex++;
    }
}
