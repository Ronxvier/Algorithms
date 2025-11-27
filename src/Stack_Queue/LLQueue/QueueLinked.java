package Stack_Queue.LLQueue;

public class QueueLinked {
    private Stack_Queue.LLQueue.Node head ;
    public void queue(int input) {
        Stack_Queue.LLQueue.Node newNode = new Stack_Queue.LLQueue.Node(input);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Stack_Queue.LLQueue.Node dequeue() {
        Stack_Queue.LLQueue.Node current = head;
        Stack_Queue.LLQueue.Node prev = null; // stores previous node which will never have to be relinked.

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
