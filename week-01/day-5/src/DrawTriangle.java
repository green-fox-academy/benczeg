import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall triangle you want?");
        int tall = scanner.nextInt();
        for (int i = 0; i < tall + 1; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }
}
