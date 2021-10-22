package producer_consumer;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {

    private final IntQueue queue;

    public Producer(IntQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                Thread.sleep(TimeUnit.MILLISECONDS.toMillis(500));
                queue.push(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
