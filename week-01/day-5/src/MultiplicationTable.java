import java.util.Scanner;

// Create a program that asks for a number and prints the multiplication table with that number
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number:");
        int num = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + num + " = " + num * i);
        }
    }
}
