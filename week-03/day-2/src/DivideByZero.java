import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a number to dived 10 with it:");
        int divider = scanner.nextInt();
        int ten = 10;
        try {
            System.out.println(ten / divider);
        } catch (ArithmeticException e) {
            System.out.println("fail");
            // Log it
        }
    }
}
