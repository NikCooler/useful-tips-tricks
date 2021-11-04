package collection.fifo;

import java.util.ArrayDeque;

public class QueueTest {

    // First-in First-out = Queue
    public static void main(String[] args) {
        var deque = new ArrayDeque<Integer>();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);

        System.out.println(deque.element());

        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
    }
}
