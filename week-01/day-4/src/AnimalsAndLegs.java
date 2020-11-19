import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Gimme two numbers: chickens and pigs owned");
        int chickens= scanner.nextInt();
        int pigs= scanner.nextInt();
        System.out.println("Legs counted: "+ (pigs*4+chickens*2));
    }

}
