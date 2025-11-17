package StacknQueue.Assessments;

public class TestStructure {
    public static void main(String[] args) {
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
