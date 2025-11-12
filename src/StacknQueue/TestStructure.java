package StacknQueue;

public class TestStructure {
    public static void main(String[] args) {
        // Stack Test
        Stack myStack = new Stack();
        myStack.push("Schlawg");
        myStack.push("Dog");
        myStack.push("Dawg");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println();

        // Queue Test
        Queue myQueue = new Queue();
        myQueue.queue("Schlawg");
        myQueue.queue("Dog");
        myQueue.queue("Dawg");
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
