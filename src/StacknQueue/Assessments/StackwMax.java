package StacknQueue.Assessments;

/*
Question 2
Stack with max.
Create a data structure that efficiently supports the stack operations (push and pop)
and also a return-the-maximum operation. Assume the elements are real numbers so that
you can compare them.
 */

public class StackwMax {
    private int N = 0;
    private Integer max;
    private Integer[] stack;

    public StackwMax() {
        stack = new Integer[1];
    }

    public void push(Integer i) {
        if (max == null || i>max) {
            max=i;
        }
        if (N==stack.length) {
            resize(N*2);
        }
        stack[N++] = i;
    }

    public Integer pop() {
        if (N == stack.length/2)
            resize(stack.length/2);
        return stack[--N];
    }

    public Integer max() {
        return max;
    }

    public void resize(int i) {
        Integer[] copy = new Integer[i];
        for (int r=0; r < N; r++)
            copy[r] = stack[r];
        stack = copy;
    }
}
