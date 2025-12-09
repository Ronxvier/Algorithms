package Sorts.Shell;

public class Shell {
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while (h<N/3)
            h=3*h+1; // 1,4,13,40,121,364, etc.

        while (h >= 1){
            // h-sort the array
            for (int i=h; i<N; i++){
                /* for each item in the array do this comparison, starting with the comparison of
                the "h'th" entry and the entry 'h' before it.
                 */

                // Here we're moving in intervals of 1 up the array, working on pairs of x and x-h.

                for(int j = i; j>=h && less(a[j], a[j-h]); j-=h){
                    /* if conditions are met:
                        * there is an item 'h' before the current item
                        * the current item is less than the one 'h' entries before it
                       switch the current item with the one 'h' entries before it.
                     */
                    exch(a,j,j-h);
                    // then check the item 'h' before it for the same condition.

                    // Here we're moving down the arrays in intervals of h.
                }
            }
            h=h/3;
        }
    }

    public static boolean isSorted(Comparable[] a){
        for (int i=1; i<a.length; i++){
            if (less(a[i], a[i-1]))
                return false;
        }
        return true;
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
