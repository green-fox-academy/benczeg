import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinesInCircle2 {
    public static void mainDraw(Graphics graphics) {

        int x0 = 360;
        int y0 = 360;
        int r = 200;
        int r2 = 100;
        //int x; // still working, amazing
        //int y1;
        //int y2;
        //int y3;
        //int y4;
        int i = 0;
        int c;
        int c2;
        int b = -2 * y0;
        int a = 1;
        List<Integer> y1 = new ArrayList<>();
        List<Integer> y2 = new ArrayList<>();
        List<Integer> y3 = new ArrayList<>();
        List<Integer> y4 = new ArrayList<>();

        for (int x = (x0 - r); x < (x0 + r); x=x+10) { // 400 adat
            c = x * x - 2 * x * x0 + x0 * x0 - r * r + y0 * y0;
            c2 = x * x - 2 * x * x0 + x0 * x0 - r2 * r2 + y0 * y0;
            y1.add((-b + (int) sqrt(b * b - 4 * a * c)) / 2 * a);
            y2.add((-b - (int) sqrt(b * b - 4 * a * c)) / 2 * a);

            /*if (x >= r - r2) {                                        //clever part
                y3.add((-b + (int) sqrt(b * b - 4 * a * c2)) / 2 * a);
                y4.add((-b - (int) sqrt(b * b - 4 * a * c2)) / 2 * a);
                 {
                     graphics.drawLine(x, y1.get(i), x, y3.get(i));
                     graphics.drawLine(x, y2.get(i), x, y4.get(i));
                    i++;
                }*/
        }
        for (int j = 0; j < 40; j++) {
            graphics.drawLine(j+160, y1.get(j), 559-j, y2.get(j));
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