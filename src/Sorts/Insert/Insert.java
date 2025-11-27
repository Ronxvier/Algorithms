package Sorts.Insert;

public class Insert {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i=1; i<N; i++){
            int b = i;
            while (b>=1 && less(a[b],a[b-1])){ // check boundary before indexing a[b-1] to prevent b-1=-1
                exch(a,b,b-1);
                b--;
            }
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }

    private static void exch(Comparable[] a, int p, int q) {
        Comparable x = a[p];
        a[p] = a[q];
        a[q] = x;
    }
}
