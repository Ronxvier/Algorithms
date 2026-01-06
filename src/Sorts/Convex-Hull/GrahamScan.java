/* quickly, geometric properties of convex hull
1. You can traverse the convex hull by making only counterclockwise turns
2. Vertices of convex hull appear in increasing order of polar angle
w/ respect to the point with the lowest y-coordinate (p).
 */

/*
 Also, graham scan info:
 1. Choose point with smallest y-coordinate (p).
 2. Sort points by polar angle with p.
 3. Consider points in order, discard unless it creates a cc turn.
 */
public class GrahamScan {
    public static void main(String[] args){
        System.out.println("Hey there, you entered:"+ args[0]);
    }
}
