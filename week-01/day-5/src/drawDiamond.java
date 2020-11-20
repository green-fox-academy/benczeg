import java.util.Scanner;

public class drawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall diamond you want? ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Only odd numbers show well, but here is a smaller one:");
        }
        int tall = (num + 1) / 2;
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
        stars -= 2; //mégegyszer végre kell hajtani
        spaces++;
        for (int i = 1; i < tall; i++) { //eggyel kevesebbszer kell végrehajtani
            stars -= 2; //kiemeltem az elejére! csökkentem a csillagokat 2vel
            spaces++; //növelem a szóközöket
            for (int j = 0; j < spaces; j++) { //szóközök
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) { //csillagok
                System.out.printf("*");
            }

            System.out.println(""); //sortörés

        }


    }
}

