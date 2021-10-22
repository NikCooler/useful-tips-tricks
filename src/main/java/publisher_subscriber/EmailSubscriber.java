package publisher_subscriber;

public class EmailSubscriber implements Subscriber {

    @Override
    public Integer getId() {
        return 1;
    }

    @Override
    public void receive(Message msg) {
        System.out.println("Email sub: " + msg.getMsg());
    }
}
