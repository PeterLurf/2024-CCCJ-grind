package ImportantAlgorithms;
import java.util.*;
@SuppressWarnings("unused")
public class Deque {
    
    private Node first = null;
    private Node last = null;
    
    private class Node {
        String item;
        Node next;
        Node prev;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public void pushLeft(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        first.prev = null;
        if (isEmpty()) {
            last = first;
        } else {
            oldFirst.prev = first;
        }
    }
    
    public void pushRight(String item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        last.prev = oldLast;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }
    
    public String popLeft() {
        String item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        } else {
            first.prev = null;
        }
        return item;
    }
    
    public String popRight() {
        String item = last.item;
        last = last.prev;
        if (isEmpty()) {
            first = null;
        } else {
            last.next = null;
        }
        return item;
    }
    
    public static void main(String[] args) {
        Deque d = new Deque();
        d.pushLeft("a");
        d.pushLeft("b");
        d.pushLeft("c");
        d.pushRight("d");
        d.pushRight("e");
        d.pushRight("f");
        System.out.println(d.popLeft());
        System.out.println(d.popLeft());
        System.out.println(d.popLeft());
        System.out.println(d.popRight());
        System.out.println(d.popRight());
        System.out.println(d.popRight());
    }
}
