package StacknQueue.LLStack;

public class StackLinked {
    Node head;
    public void push(int input) {
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
