package StacknQueue.Assessments;

public class TestStructure {
    public static void main(String[] args) {
        // Testing Question 1
        TwoStackQueue myQueue = new TwoStackQueue();
        myQueue.enqueue("Schlawg");
        myQueue.enqueue("Dawg");
        myQueue.enqueue("Shnawg");
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

        System.out.println();

        // Testing Question 2
        StackwMax myStack = new StackwMax();

        myStack.push(3);
        myStack.push(4);
        myStack.push(999);
        myStack.push(5);
        System.out.println(myStack.max());
        System.out.println();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
