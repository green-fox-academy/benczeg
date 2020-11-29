import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Spiral {
    public static void mainDraw(Graphics graphics) {

        int x0 = 360;
        int y0 = 360;
        int r = 200;
        //int x; //i change this
        int y1;
        int y2;
        int c;
        int b;
        int a;



        for (int x = (x0-r); x < (x0+r); x++) {
            c = x * x - 2 * x * x0 + x0 * x0 - r * r + y0 * y0;   
            a = 1;
            b = -2 * y0;
            y1 = (-b + (int) Math.sqrt(b * b - 4 * a * c)) / 2 * a;
            y2 = (-b - (int) Math.sqrt(b * b - 4 * a * c)) / 2 * a;
            graphics.drawLine(x, y1, x, y1);
            graphics.drawLine(x, y2, x, y2);
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