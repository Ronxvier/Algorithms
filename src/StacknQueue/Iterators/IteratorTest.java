package StacknQueue.Iterators;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayStack myStack = new ArrayStack();
        myStack.push("Slawg");
        myStack.push("Dawg");
        myStack.push("Schnawg");
        System.out.println(myStack.isEmpty());
        for (String s: myStack)
            System.out.println(s);
    }
}
