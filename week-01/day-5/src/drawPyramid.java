import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
public class drawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall pyramid you want?");
        int tall = scanner.nextInt();
        int stars = 1;
        int spaces = 0;
        if (tall % 2 == 0) {
            spaces = tall;
        } else if (tall % 2 == 1) {
            spaces = tall - 1;
        }

        for (int i = 0; i < tall; i++) { //sorok
            for (int j = 0; j < spaces; j++) { //szóközök
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) { //csillagok
                System.out.printf("*");
            }
            stars += 2; //növelem a csillagokat 2vel
            spaces--; //csökkentem a szóközöket
            System.out.println(""); //sortörés

        }


    }
}
