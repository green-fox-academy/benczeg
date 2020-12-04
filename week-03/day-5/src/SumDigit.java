
// Given a non-negative integer n, return the sum of it's digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).


public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumDigit(12016));
    }

    public static int sumDigit(int n) {
        int total = 0;
        if (n != 0) {
            n = n % 10 + sumDigit(n / 10);
            return n;
        }
        return total;
    }

}
