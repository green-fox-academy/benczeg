public class Sum {
    public static int sum(int[] a) {
        int sums = 0;
        for (int i = 0; i < a.length; i++) {
            sums += a[i];
        }
        return sums;
    }

    public static void main(String[] args) {
        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(numList));
    }
}
