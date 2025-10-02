package StacknQueue.LLStack;

public class LLStackTest {
    public static void main(String[] args) {
        StackLinked myStack = new StackLinked();
        myStack.push(9);
        myStack.push(3);
        myStack.push(2);
        myStack.push(4);
        myStack.list();
        System.out.println();
        int myvar = myStack.pop().data;
        myStack.list();
        System.out.println("popped element: " + myvar);
    }
}
