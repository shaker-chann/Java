package assemble;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        System.out.println("queue.size() "+queue.size());
        System.out.println("queue.peek() "+queue.peek());
        System.out.println("queue.poll() "+queue.poll());

        queue.add("d");
        queue.remove();
        System.out.println("queue.element() "+queue.element());
        Iterator iterator = queue.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
