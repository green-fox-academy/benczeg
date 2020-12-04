// Write a function that finds the largest element of an array using recursion.

import java.util.Arrays;
import java.util.List;

public class maximumFinder {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, 9, 0};
        System.out.println(Arrays.toString(maxFind(nums)));
    }

    public static int[] maxFind(int[] a) {
        int n = a.length;
        if (n == 1) {
            return a;
        } else {
            a[n - 2] = Math.max(a[n - 1], a[n - 2]);
            int[] b = new int[a.length - 1];
            for (int i = 0; i < b.length; i++) {
                b[i] = a[i];
            }
            return maxFind(b);
        }


    }
}
