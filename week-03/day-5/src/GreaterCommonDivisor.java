// Find the greatest common divisor of two numbers using recursion.

public class GreaterCommonDivisor {
    public static void main(String[] args) {
        int a = 24;
        int b = 72;
        System.out.println(comDiv(a, b));
    }

    public static int comDiv(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        /*for (int i = 1; i <= div; i++) {                   // not a  recursion..... anyway....
            if (a % i == 0 && b % i == 0) {
                max = i;
            }*/

        if (min != 0) {
            return comDiv(max, max % min);
        } else {
            return min;
        }
    }
//        return max;

}
