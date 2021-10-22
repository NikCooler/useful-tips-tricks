package producer_consumer;

import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {

    private final IntQueue queue;

    public Consumer(IntQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(TimeUnit.MILLISECONDS.toMillis(1500));
                var el = queue.poll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
