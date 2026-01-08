package Sorts.Merge;

import java.util.Arrays;

public class mergeTest {
    public static void main(String[] args) {
        Comparable[] a = {133, 154, 12, 22, 89, 22, 33, 42};
        mergeSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
