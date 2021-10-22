package producer_consumer;

public class ProdConsApp {

    public static void main(String[] args) {
        var queue = new IntQueue(3);
        var producer = new Producer(queue);
        var consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
