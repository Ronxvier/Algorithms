package StacknQueue.Assessments;
import java.util.Iterator;

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


class Stack implements Iterable<String> {
    private String[] q;
    private int N = 0;

    public Iterator iterator() {
        return new StackIterator();
    }

    public class StackIterator implements Iterator<String> {
        private int i = N;

        public boolean hasNext() {
            return (i>0);
        }

        public String next() {
            return q[--i];
        }
    }
    public Stack() {
        q = new String[1];
    }

    public void push(String s) {
        if (N == q.length)
            resize(N*2);
        q[N++] = s;
    }

    public String pop() {
        if(N== q.length/2)
            resize(q.length/2);
        return q[--N]; // REMEMBER: Zero based index. That's why N is decremented before returning the value.
    }

    public void resize(int x) {
        String[] copy = new String[x];
        for (int i=0; i < N; i++)
            copy[i] = q[i];
        q = copy;
    }
}
