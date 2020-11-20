import java.util.Scanner;

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Two numbers please");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 >= num2) {
            System.out.println("The second number should be bigger");
        } else {
            while (num2 != num1) {
                System.out.println(num2);
                num2--;
            }
            System.out.println(num2);
        }
    }
}
