package Sorts.Assessments;

import java.util.Arrays;

public class Permutations {
    public static boolean isPermutation(Comparable[] a, Comparable[] b) {
        return Arrays.equals(shellSort(a), shellSort(b));
    }

    public static Comparable[] shellSort(Comparable[] list) {
        int N = list.length;
        int h = 1;
        while (h<N/3) {
            h=3*h+1;
        }

        while (h>=1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(list[j], list[j - h]); j -= h) {
                    exch(list, j, j - h);
                }
            }
            h=h/3;
        }
        return list;
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b)<0;
    }

    private static void exch(Comparable[] list, int p, int q) {
        Comparable x = list[q];
        list[q] = list[p];
        list[p] = x;
    }
}
