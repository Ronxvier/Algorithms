package Sorts.Assessments;

import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
        Comparable[] a = {133,99,43,52,51};
        Comparable[] b = {155,99,43,52,51};
        Comparable[] x = Permutations.shellSort(a);
        System.out.println(Arrays.toString(x));
        System.out.println(Permutations.isPermutation(a,b));
    }
}
