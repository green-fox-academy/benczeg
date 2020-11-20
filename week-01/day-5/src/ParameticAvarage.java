import javax.swing.text.Style;
import java.util.Scanner;

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
public class ParameticAvarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you have?");
        int cicle = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < cicle; i++) {
            System.out.println("Waiting for number:");
            int number = scanner.nextInt();
            sum += number;
        }
        double avarage = sum / cicle;
        System.out.println("Sum: " + sum);
        System.out.println("Avarage: " + avarage);
        for (int i = 0; i < cicle; i++) {
        }
    }
}
