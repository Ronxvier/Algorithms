/* LOWKEY a linked list might be better here. That way I don't need
to manage the indexes */
package Stack_Queue.Assessments;

import java.util.Iterator;

public class Dequeue<Item> implements Iterable<Item> {
    Node head;
    public Iterator<Item> iterator() {return new ListIterator();}
    public class ListIterator implements Iterator<Item> {
        private Node current = head;
        public boolean hasNext() {
            return current!= null;
        }
        public Item next() {
            Item item = current.data;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Item data;
        Node next;
        Node(Item x) {
            this.data = x;
            this.next = null;
        }
    }

    public Dequeue() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int x=0;
        Node current = head;
        while(current != null) {
            x+= 1;
            current = current.next;
        }
        return x;
    }

    public void addLast(Item item){
        if (head== null) {
            head = new Node(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(item);
        }
    }

    public void addFirst(Item item) {
        Node currentHead = head;
        head = new Node(item);
        head.next = currentHead;
    }

    public Item removeFirst(){
        Node returned = head;
        head = head.next;
        return returned.data;
    }
    public Item removeLast(){
        Node current = head;
        while (current.next.next != null){
            current = current.next; // stops at second to last node
        }
        Node returned = current.next;
        current.next = null;
        return returned.data;
    }

    public static void main(String[] args) {

    }
}
