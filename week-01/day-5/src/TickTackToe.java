import java.util.Scanner;

public class TickTackToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who begins? Hit letter 'x' or 'o':"); //Choose your player
        String start = scanner.next();
        if (start.equals("x")) {
            String x = "x";
            String o = "o";
        } else if (start.equals("o")) {
            String x = "o";
            String o = "x";
        } else {
            System.out.println("Wrong character, start again!");
        }
        System.out.println("First player:"); //First step
        String firstStep = scanner.next();
        int xFirst = Integer.parseInt(firstStep.substring(0, 1));
        int xyirst = Integer.parseInt(firstStep.substring(2));

    }
}
