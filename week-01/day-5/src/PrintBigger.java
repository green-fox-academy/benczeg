import java.util.Scanner;
// Write a program that asks for two numbers and prints the bigger one

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two numbers please:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 >= num2) {
            System.out.println("First number is bigger.");
        } else if (num1 == num2) {
            System.out.println("Equals.");
        } else {
            System.out.println("Second number is bigger.");
        }
    }


}
