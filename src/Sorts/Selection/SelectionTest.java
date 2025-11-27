package Sorts.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Comparable[] a = {133,99,43,52,51};
        Selection.sort(a);
        String b = Arrays.toString(a);
        System.out.println(b);
    }
}
