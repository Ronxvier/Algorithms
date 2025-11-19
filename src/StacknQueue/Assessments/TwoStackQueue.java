package StacknQueue.Assessments;

import StacknQueue.Stack;

/*
Question 1
Queue with two stacks.
Implement a queue with two stacks so that each queue operations
takes a constant amortized number of stack operations.

For the sake of continuity, the Stack Data structure I'll be using is
the one from the root of the StacknQueue directory.

 */

public class TwoStackQueue {
    private int Na = 0; // to track the number of items in the A Stack
    private int Nb = 0; // to track the number of items in the B Stack
    private Stack A;
    private Stack B;

    public TwoStackQueue() {
        A = new Stack();
        B = new Stack();
    }

    public void enqueue(String s) {
            A.push(s);
            Na++;
    }

    public String dequeue() {
        /*
        "If B isn't empty, pop from B. If it is, pop everything from A onto B, then pop from B."
         */
        if (Nb==0){
            for (int i=0; i<Na; i++) {
                B.push(A.pop());
                Nb++;
            }
        }
        return B.pop();
    }
}
