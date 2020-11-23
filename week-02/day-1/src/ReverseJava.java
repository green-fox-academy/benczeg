public class ReverseJava {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        int[] reverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverse[(numbers.length - i - 1)] = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = reverse[i];
            System.out.print(numbers[i] + " ");
        }
    }
}
