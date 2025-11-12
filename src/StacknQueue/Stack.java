package StacknQueue;

public class Stack {
    private String[] q;
    private int N = 0;
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
