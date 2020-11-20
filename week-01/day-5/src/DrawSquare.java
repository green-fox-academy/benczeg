import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the size of the square please:");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) { //kezdő sor
            System.out.print("%");
        }
        System.out.println("");
        for (int i = 0; i < (a - 2); i++) { //köztes sorok
            System.out.print("%");
            int b = a - 2; //szóközök száma
            for (int j = 0; j < b; j++) {
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.println("");
        }
        for (int i = 0; i < a; i++) { //záró sor
            System.out.print("%");
        }
    }
}
