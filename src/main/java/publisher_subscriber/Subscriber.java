package publisher_subscriber;

public interface Subscriber {

    Integer getId();
    void receive(Message msg);
}
