import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SpiralPythagorean {
    public static void mainDraw(Graphics graphics) {

        // first triangle / starting point

        // calculate with doubles, change into int at last moment (when putting in List)

        double Ax = (double) WIDTH / 2;  //make it changeable later
        double Ay = (double) HEIGHT / 2;
        // double a = 50; // kezdő sugár
        double Bx = Ax + 1;
        double By = Ay;
        double Cx = Bx;
        double Cy = By + 1;
        List<Integer> xPointCoordinates = new ArrayList<>();
        List<Integer> yPointCoordinates = new ArrayList<>();
        xPointCoordinates.add((int) Cx);
        yPointCoordinates.add((int) Cy);

        // 0 = Bx * Bx - 2 * Bx * Cx + Cx * Cx + By * By - 2 * By * Cy + Cy * Cy - 1;
        // 0 = Ax * Ax - 2 * Ax * Cx + Cx * Cx + Ay * Ay - 2 * Ay * Cy + Cy * Cy - i;
        // Bx * Bx - 2 * Bx * Cx + By * By - 2 * By * Cy - 1 = Ax * Ax - 2 * Ax * Cx + Ay * Ay - 2 * Ay * Cy - i;

        for (int i = 3; i < 17; i++) {
            Cx = (Ax * Ax * 2 * By + Ay * Ay * 2 * By - 2 * Ay * Bx * Bx + 2 * Bx * Cx - 2 * Ay * By - 2 * Ay - 2 * By * i) /
                    2 * Bx - 2 * By * Ax * 2 * By;
            Cy = (Bx * Bx - 2 * Bx * Cx + By - 1) / 2 * By;
            xPointCoordinates.add((int) Cx);
            yPointCoordinates.add((int) Cy);
        }


       /* for (int i = 3; i < 360; i++) {
            if (Cx - Ax >= 0 && Cy - Ay >= 0) {
                Cx = Cx - (i - 1) / Math.sqrt(i);
                Cy = Cy + (i - 1) / Math.sqrt(i);
                xPointCoordinates.add((int) Cx);
                yPointCoordinates.add((int) Cy);
            } else if (Cx - Ax <= 0 && Cy - Ay >= 0) {
                Cx = Cx - (i - 1) / Math.sqrt(i);
                Cy = Cy - (i - 1) / Math.sqrt(i);
                xPointCoordinates.add((int) Cx);
                yPointCoordinates.add((int) Cy);
            } else if (Cx - Ax < 0 && Cy - Ay < 0) {
                Cy = Cy - (i - 1) / Math.sqrt(i);
                Cx = Cx + (i - 1) / Math.sqrt(i);
                xPointCoordinates.add((int) Cx);
                yPointCoordinates.add((int) Cy);
            } else {
                Cy = Cy + (i - 1) / Math.sqrt(i);
                Cx = Cx + (i - 1) / Math.sqrt(i);
                xPointCoordinates.add((int) Cx);
                yPointCoordinates.add((int) Cy);
            }*/

        //}
        for (int i = 0; i < xPointCoordinates.size(); i++) {

            System.out.println(xPointCoordinates.get(i) + " " + yPointCoordinates.get(i));
        }
        int[] intArrayX = new int[xPointCoordinates.size()];
        int[] intArrayY = new int[yPointCoordinates.size()];
        for (int i = 0; i < xPointCoordinates.size(); i++) {
            intArrayX[i] = xPointCoordinates.get(i);
            intArrayY[i] = yPointCoordinates.get(i);
        }
        /*int[] intArrayY = new int[yPointCoordinates.size()];
        intArrayY = yPointCoordinates.toArray((int) intArrayY);
*/

        for (int i = 0; i < xPointCoordinates.size(); i++) {
            graphics.drawPolyline(intArrayX, intArrayY, intArrayX.length);
        }

    }

    // Don't touch the code below
    static int WIDTH = 720;
    static int HEIGHT = WIDTH;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}