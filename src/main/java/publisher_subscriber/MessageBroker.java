package publisher_subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageBroker {

    private final Map<Integer, Subscriber> subscribers = new HashMap<>();

    public void subscribe(Subscriber s) {
        if (subscribers.containsKey(s.getId())) {
            throw new IllegalArgumentException("Subscriber is already present by id: " + s.getId());
        }
        subscribers.put(s.getId(), s);
    }

    public void unsubscribe(Subscriber s) {
        if (!subscribers.containsKey(s.getId())) {
            throw new IllegalArgumentException("Subscriber is not found by id: " + s.getId());
        }
        subscribers.remove(s.getId());
    }

    public void publish(Message msg) {
        subscribers.forEach((k, v) -> v.receive(msg));
    }
}
