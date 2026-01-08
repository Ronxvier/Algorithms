package Sorts.Merge;

public class mergeSort {
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        assert isSorted(a,lo, mid);
        assert isSorted(a,mid+1, hi);
        for (int k = lo; k<=hi; k++)
            aux[k] = a[k];
        int i=lo, j=mid+1;
        for (int k = lo; k<=hi; k++) {
            if (i>mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];
            else if (less(aux[j],aux[i])) a[k] = aux[j++]; // if the point in the second subarray is smaller
            else a[k] = aux[i++]; // if the point in the first subarray is greater
        }
        assert isSorted(a,lo, hi);
    }
    private static void sort(Comparable[] a, Comparable [] aux, int lo, int hi) {
        if (hi<=lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, aux,lo,mid);
        sort(a, aux,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length-1);
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static boolean isSorted(Comparable[] a, int lb, int ub) {
        for (int i=lb; i<ub; i++) {
            if (less(a[i+1], a[i])) return false;
        }
        return true;
    }
}
