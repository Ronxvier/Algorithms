package StacknQueue.Iterators;

// TODO: Needs to create a stack that removes the last element pushed. NECESITO: push(), pop()
    // REMEMBER: this list needs to be DYNAMIC.

import java.util.Iterator;

public class ArrayStack implements Iterable<String>{
    private String[] s;
    private int N = 0;
    public Iterator<String> iterator() {return new ReverseArrayIterator();}
    private class ReverseArrayIterator implements Iterator<String> {
        private int i = N;
        public boolean hasNext() {return i>0;}
        public String next() {return s[--i];}
        /*
        Decrementing the array index (starting at the back of the array) obeys
        the nature of a stack. The next() method determines the nature of your
        iteration, and the hasNext() method sets the condition at which your
        loop stops.
        */
    }
    public ArrayStack() {
        s = new String[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String item) {
        if (N == s.length) resize(2 * s.length);
        s[N++] = item;
        /*
        N++ increments the value N while also assigning that index in the
        array to the String value in the argument.
        */
    }

    public String pop() {
        if (N == s.length/2) resize(s.length/2);
        return s[--N];
        /*
        --N decrements N by one, and then returns the value at the new N.
        Decrementation is done first because java uses a zero-based index.
        */
    }

    private void resize(int capacity) {
        /*
        The "resize()" method takes in an integer argument 'N' and creates
        a new array of size N. The method then iterates over the current
        array copying every element into the copy array, before setting the
        copy array as the new current array.
        */
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++)
            copy[i] = s[i];
        s = copy;
    }
}
