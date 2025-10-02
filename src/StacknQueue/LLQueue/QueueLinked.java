package StacknQueue.LLQueue;

public class QueueLinked {
    private StacknQueue.LLQueue.Node head ;
    public void queue(int input) {
        StacknQueue.LLQueue.Node newNode = new StacknQueue.LLQueue.Node(input);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public StacknQueue.LLQueue.Node dequeue() {
        StacknQueue.LLQueue.Node current = head;
        StacknQueue.LLQueue.Node prev = null; // stores previous node which will never have to be relinked.

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

    public Boolean isEmpty() {
        return (head == null);
    }
}
