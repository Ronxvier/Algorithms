package Stack_Queue.Assessments;

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

        // Testing Dequeue
        Dequeue myDequeue = new Dequeue();
        myDequeue.addFirst("Entry 1");
        myDequeue.addFirst("Entry 2");
        myDequeue.addFirst("Entry 3");
        myDequeue.addFirst("Entry 4");
        myDequeue.addLast("Entry 5");
        System.out.println("Is the list empty? " + myDequeue.isEmpty());
        System.out.println(myDequeue.removeFirst()); // Entry 4?
        System.out.println(myDequeue.removeLast()); // Entry 5?
        System.out.println(myDequeue.removeLast()); // Entry 1?
        System.out.println(myDequeue.removeFirst()); // Entry 3?
        System.out.println(myDequeue.removeFirst()); // Entry 2?
        System.out.println("Is the list empty? " + myDequeue.isEmpty());
    }
}
