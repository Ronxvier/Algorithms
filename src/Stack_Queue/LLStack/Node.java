package Stack_Queue.LLStack;

public class Node<Item> {
    Item data;
    Node next;

    Node(Item input) {
        this.data = input;
        this.next = null;
    }
}
