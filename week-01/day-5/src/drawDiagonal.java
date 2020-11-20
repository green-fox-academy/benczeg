import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
public class drawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the size of the square please:");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) { //kezdő sor
            System.out.print("%");
        }
        System.out.println("");
        int hanyadik = 0;
        for (int i = 0; i < (a - 2); i++) { //köztes sorok
            System.out.print("%");

            for (int k = 0; k < hanyadik; k++) {//szóközök elől
                System.out.print(" ");
            }

            System.out.print("%"); //simple %

            for (int l = 0; l < a - 2 - hanyadik - 1; l++) { //szóközök hátul
                System.out.print(" ");
            }
            hanyadik++;
            System.out.print("%");
            System.out.println("");
        }
        for (int i = 0; i < a; i++) { //záró sor
            System.out.print("%");
        }
    }
}
