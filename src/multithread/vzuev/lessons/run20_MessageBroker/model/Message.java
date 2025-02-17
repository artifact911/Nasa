package multithread.vzuev.lessons.run20_MessageBroker.model;

public final class Message {

    private final String data;

    public Message(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return this.getClass().getName()
                + "[data = " + this.data + "]" ;
    }
}
