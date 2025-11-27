package Sorts.Insert;

import java.util.Arrays;

public class InsertTest {
    public static void main(String[] args) {
        Comparable[] a = {133,99,43,52,51};
        System.out.println(Insert.isSorted(a));
        Insert.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Insert.isSorted(a));
    }
}
