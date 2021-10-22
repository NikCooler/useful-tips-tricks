package publisher_subscriber;

public class MessagePublisher implements Publisher {

    private final MessageBroker broker;

    public MessagePublisher(MessageBroker broker) {
        this.broker = broker;
    }

    @Override
    public void publish(Message msg) {
        broker.publish(msg);
    }
}
