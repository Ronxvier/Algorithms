package StacknQueue.LLStack;

public class LLStackTest {
    public static void main(String[] args) {
        StackLinked myStack = new StackLinked();
        myStack.push(3);
        myStack.push(9);
        myStack.push(9);
        myStack.push(102);
        myStack.list();
        System.out.println();
        int myvar = myStack.pop().data;
        myStack.list();
        System.out.println("Popped element:" + myvar );
    }
}
