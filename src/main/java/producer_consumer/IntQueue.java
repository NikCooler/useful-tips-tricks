package producer_consumer;

public class IntQueue {

    private final int MASK;
    private final int[] arr;

    private int firstIdx;
    private int lastIdx;
    private int count;

    public IntQueue(int capacity) {
        int highestOneBit = Integer.highestOneBit(capacity);
        MASK = (highestOneBit << 1) - 1;
        arr = new int[MASK + 1];
    }

    public synchronized void push(int el) throws InterruptedException {
        while(count == arr.length) {
            this.wait();
        }
        arr[lastIdx++] = el;
        System.out.println("push: " + el);
        lastIdx = lastIdx & MASK;
        count++;
        notifyAll();
    }

    public synchronized int poll() throws InterruptedException {
        while(count == 0) {
            this.wait();
        }
        int el = arr[firstIdx++];
        System.out.println("poll: " + el);
        firstIdx = firstIdx & MASK;
        count--;
        notifyAll();
        return el;
    }
}
