package Stack_Queue;

import java.util.Iterator;

public class Queue implements Iterable<String>{
    private String[] q;
    private int N = 0;
    private int pos = 0;

    public Iterator<String> iterator() {
        return new QueueIterator();
    }

    public class QueueIterator implements Iterator<String>{
        private int i = N;
        private int j = 0;
        public boolean hasNext() {
            return (j<N); // Remember hasNext() is the Condition that stops the next() method.
        }

        public String next() {
            return q[j++];
        }
    }

    public Queue() {
        q = new String[1];
    }

    public void queue(String s) {
        if (N == q.length)
            resize(N*2);
        q[N++] = s;
    }

    public String dequeue() {
        if(N== q.length/2)
            resize(q.length/2);
        return q[pos++]; // REMEMBER: Zero based index. That's why N is decremented before returning the value.
    }

    public void resize(int x) {
        String[] copy = new String[x];
        for (int i=0; i < N; i++)
            copy[i] = q[i];
        q = copy;
    }
}
