package Sorts.Merge;

public class buMergeSort {
    private static Comparable[] aux;
    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        for (int k=0; k<=hi; k++)
            aux[k] = a[k];
        int i = lo, j=mid+1;
        for (int k = lo; k<= hi; k++) {
            if (i>mid) a[k] = aux[j++];
            else if (j>mid) a[k] = aux[i++];
            else if(less(i,j)) a[k] = aux[i++];
            else if (less(j,i)) a[k] = aux[j++]; // checking condition is kind of unnecessary, we know this is the last condition left
        }
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz=1; sz<= N; sz=2*sz) {
            for (int lo = 0; lo<N-sz; lo+=sz+sz) { // lo+=2sz because each subarray is twice sizelength
               merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));
               /*
                First pass goes over different subarray lengths (sz=1+) (elements are grouped into subarrays of 2)
                Second pass goes within each subarray (starting at length 2+) and merges/sorts each.
                lo+sz-1 because of 0 based indexing, need to use min to ensure lo+2sz-1 isn't larger
                than the length of the array itself.
                */
            }
        }

    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b)<0;
    }
}
