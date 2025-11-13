package StacknQueue;

public class TestStructure {
    public static void main(String[] args) {
        // Stack Test
        Stack myStack = new Stack();
        myStack.push("Schlawg");
        myStack.push("Dog");
        myStack.push("Dawg");

        // Testing Iteration
        for (String s: myStack)
            System.out.println(s);

        System.out.println();
        // Testing pop method
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println();

        // Queue Test
        Queue myQueue = new Queue();
        myQueue.queue("Schlawg");
        myQueue.queue("Dog");
        myQueue.queue("Dawg");
        // Testing Iteration
        for (String s: myQueue)
            System.out.println(s);

        System.out.println();
        // Testing pop method
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

    }
}
