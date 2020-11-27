import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagonTriangleSwitch {
    public static void mainDraw(Graphics graphics) {

        //half made....

        int triangleNumbers = 22; // mennyi sort akarunk
        int triangleBase = WIDTH / triangleNumbers; // a
        int triangleHeight = (int) (Math.sqrt(3) * triangleBase / 2);
        int xStart;
        int yStart;
        int x;
        int xCount = triangleNumbers;
        for (int j = 0; j < triangleNumbers; j++) {
            xStart = j * triangleBase / 2;
            yStart = HEIGHT - j * triangleHeight;
            xCount--;
            if (j % 2 == 0) {
                for (int i = 0; i < xCount; i++) {
                    x = xStart + i * triangleBase;
                    if (i % 3 == 1) {
                        graphics.drawLine(x, yStart, x + triangleBase, yStart);
                    } else if (i % 3 == 2) {
                        graphics.drawLine(x, yStart, x + triangleBase / 2, yStart - triangleHeight);
                    } else {
                        graphics.drawLine(x + triangleBase / 2, yStart - triangleHeight, x + triangleBase, yStart);
                    }
                }
            }
        }
    }


    // Don't touch the code below
    static int WIDTH = 720;
    static int HEIGHT = 720;

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