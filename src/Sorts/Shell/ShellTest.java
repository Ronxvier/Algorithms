package Sorts.Shell;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        Comparable[] a = {133,99,43,52,51};
        System.out.println(Shell.isSorted(a));
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Shell.isSorted(a));
    }
}
