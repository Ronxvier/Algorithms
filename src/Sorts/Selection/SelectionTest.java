package Sorts.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Comparable[] a = {133,99,43,52,51};
        System.out.println(Selection.isSorted(a));
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Selection.isSorted(a));
    }
}
