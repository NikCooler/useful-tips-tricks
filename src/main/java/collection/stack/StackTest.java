package collection.stack;

import java.util.ArrayDeque;

public class StackTest {

    // First-in Last-out = Stack
    public static void main(String[] args) {
        var deque = new ArrayDeque<Integer>();
        deque.push(1);
        deque.push(2);
        deque.push(3);

        System.out.println(deque.peek());

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
}
