package StacknQueue.LLStack;

import java.util.Iterator;
public class StackLinked<Item> implements Iterable<Item> {
    Node head;
    public Iterator<Item> iterator(){return new ListIterator();}
    public class ListIterator implements Iterator<Item> {
        private Node<Item> current = head;
        public boolean hasNext(){
            return current!=null;
        }
        public Item next() {
            Item item = current.data;
            current = current.next;
            return item;
        }
    }


    public void push(Item input) {
        Node newNode = new Node(input);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node pop() {
        if (head == null) {
            System.out.println("No nodes to pop");
            return null;
        } else if (head.next == null) {
            Node returned = head;
            head = null;
            return returned;
        } else {
            Node returned = head;
            head = head.next;
            return returned;
        }
    }

    public void list() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public Boolean isEmpty() {
        return (head == null);
    }
}
