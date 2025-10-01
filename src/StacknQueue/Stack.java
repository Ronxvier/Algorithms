package StacknQueue;

import java.util.ArrayList;
public class Stack {
    private static ArrayList<Integer> myStack = new ArrayList<>();

    public static void push(int input) {
        myStack.add(input);
    }

    public static void list() {
        for (int element: myStack) {
            System.out.println(element);
        }
    }

    public static int pop() {
        int removed = myStack.get(myStack.size()-1);
        myStack.remove(myStack.size() - 1);
        return removed;
    }

    public static boolean isEmpty() {
        return myStack.get(0) == null;
    }
}
