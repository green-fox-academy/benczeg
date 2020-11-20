import java.util.Scanner;

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean win = false;
        int stored = 24;
        System.out.println("What number did I think of?");
        int bet = scanner.nextInt();
        while (!win) {

            if (bet < stored) {
                System.out.println("The stored number is higher:");
                bet = scanner.nextInt();
            } else if (bet > stored) {
                System.out.println("The stored number is lower:");
                bet = scanner.nextInt();
            } else if (bet == stored) {
                System.out.println("You found the number: 24");
                win = true;
            } else {
                System.out.println("I don't understand.");
                bet = scanner.nextInt();
            }
        }
    }
}
