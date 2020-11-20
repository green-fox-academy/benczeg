// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
public class DrawChessTable {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("%");
                System.out.print(" ");
            }
            System.out.println("");
            for (int j = 0; j < 8; j++) {
                System.out.print(" ");
                System.out.print("%");
            }
            System.out.println("");
        }
    }
}
