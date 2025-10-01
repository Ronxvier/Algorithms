package LinkedList;

public class Linker {
    private Node head; // null value for head at first

    public void insert(int data) {
        // initialize node with your data
        Node newNode = new Node(data);

        // statement below decides where to store the data.
        // if the head is null, the list is empty, so this node becomes the head.
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
                // the idea behind this is to loop until you hit the end of the list
            }
            current.next = newNode;
        }
    }

    public Node get(int index) {
        Node current = head;
        for (int i = 0; i<index; i++) {
            current = current.next;
        }
        return current;
    }

    public void remove(int index) {
        // if node we're removing is first node, we need to make the head the next node.
        // if the index provided is larger than the list length, then we need to assert that
        // if the node we're removing is at the end of the list, we need to make that node null
        // if the node we're removing is in the middle of the list, the previous node needs
        // to be linked to the one after the one we remove.
        if (index==0) {
            head = head.next;
        }

        Node current = head;
        for (int i = 0; i<index-1; i++) {
            if (current.next == null) {
                System.out.println("The index you entered is out of bounds.");
                return;
            }
            current = current.next;
        }
        Node previous = current;
        Node removed = previous.next;
        Node nextup = removed.next;
        previous.next = nextup;
        removed = null;
    }

    public void list() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int len() {
        Node current = head;
        int ct = 0;
        while (current != null) {
            ct += 1;
            current = current.next;
        }
        return ct;
    }
}
