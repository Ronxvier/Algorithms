package Stack_Queue;

import java.util.Iterator;

public class Stack implements Iterable<String> {
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
