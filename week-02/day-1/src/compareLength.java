public class compareLength {
    public static void main(String[] args) {
        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {4, 5};
        if (firstArrayOfNumbers.length > secondArrayOfNumbers.length) {
            System.out.println("firstArrayOfNumbers is longer.");
        } else if (secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
            System.out.println("secondArrayOfNumbers is longer.");
        }
    }
}
