package Sorts.Assessments;

public class Tests {
    public static void main(String[] args) {
        Comparable[] a = {133,99,43,52,51};
        Comparable[] b = {155,99,43,52,51};
        System.out.println(Permutations.isPermutation(a,b));
        Comparable[] c = {133,99,43,52,51};
        Comparable[] d = {133,99,43,52,51};
        System.out.println(Permutations.isPermutation(c,d));
    }
}
