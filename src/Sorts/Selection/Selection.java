package Sorts.Selection;

public class Selection {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i=0; i<N; i++){
            int min = i;
            for (int j=i+1;j<N; j++){
                if (less(a[j],a[min]))
                    min=j;
            }
            exch(a, i, min); // remember, i is the first index of the unsorted array each iteration.
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a,int i, int j){
        Comparable x = a[i];
        a[i] = a[j];
        a[j] = x;
    }
}
