package StacknQueue.LLStack;

public class StackLinked {
    private Node head ;
    public void push(int input) {
        Node newNode = new Node(input);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node pop() {
        Node current = head;
        Node prev = null; // stores previous node which will never have to be relinked.

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null;
        return current;
    }

    public void list() {
        Node current = head;
        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
