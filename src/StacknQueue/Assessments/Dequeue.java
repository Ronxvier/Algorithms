/* LOWKEY a linked list might be better here. That way I don't need
to manage the indexes */
package StacknQueue.Assessments;

import java.util.Iterator;

public class Dequeue<Item> implements Iterable<Item> {
    int N;
    Node head;
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
        while(current!=null) {
            x+=1;
            current = current.next;
        }
        return x;
    }

    public void addLast(Item item){
        if (head== null) {
            head = new Node(item);
        } else {
            Node current = head;
            while (current.next!=null) {
                current = current.next;
            }
            current.next = new Node(item);
        }
    }

    public Iterator<Item> iterator(){

    }


    public static void main(String[] args) {

    }
}
