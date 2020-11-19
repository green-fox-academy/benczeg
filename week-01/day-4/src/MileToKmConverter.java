import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Km?");
        double km= scanner.nextDouble();
        double miles= km*1.609344;
        System.out.println(miles +" miles");


    }
    }
