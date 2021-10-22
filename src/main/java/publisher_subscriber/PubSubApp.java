package publisher_subscriber;

public class PubSubApp {

    public static void main(String[] args) {
        var broker = new MessageBroker();
        var msg = new Message(10, "This is a message");

        var pub = new MessagePublisher(broker);
        var sub = new EmailSubscriber();

        broker.subscribe(sub);
        pub.publish(msg);
    }

}
