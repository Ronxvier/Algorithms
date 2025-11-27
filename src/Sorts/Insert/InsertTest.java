package Sorts.Insert;

import java.util.Arrays;

public class InsertTest {
    public static void main(String[] args) {
        Comparable[] a = {133,99,43,52,51};
        Insert.sort(a);
        String b = Arrays.toString(a);
        System.out.println(b);
    }
}
