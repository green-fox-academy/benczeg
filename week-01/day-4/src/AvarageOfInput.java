import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {
        System.out.println("gimme 5 numbers pls");
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        int m4 = scanner.nextInt();
        int m5 = scanner.nextInt();
        int mSum = m1 + m2 + m3 + m4 + m5;
        double mAvarage = mSum / 5.;
        System.out.println(mSum + "," + mAvarage);


    }
}
