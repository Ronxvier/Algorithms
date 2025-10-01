package StacknQueue;

import java.util.ArrayList;

public class Queue {
    private static ArrayList<String> myQueue = new ArrayList<>();
    public static void enqueue(String input) {
        myQueue.add(0, input);
    }

    public static String dequeue() {
        String returned = myQueue.get(myQueue.size()-1);
        myQueue.remove(myQueue.size()-1);
        return returned;
    }

    public static boolean isEmpty() {
        return myQueue.get(0) == null;
    }
}

// create empty queue of strings
// insert a new string onto the queue (enqueue)
// remove and return least recently added string
// isEmpty
