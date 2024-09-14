package ImportantAlgorithms;
import java.util.*;
@SuppressWarnings("unused")
public class Queue {
    
    private Node first = null;
    private Node last = null;
    
    private class Node {
        String item;
        Node next;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public void enqueue(String item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }
    
    public String dequeue() {
        String item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
