import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

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
            for (int i = 0; i < xCount; i++) {
                x = xStart + i * triangleBase;
                graphics.drawLine(x, yStart, x + triangleBase, yStart);
                graphics.drawLine(x, yStart, x + triangleBase / 2, yStart - triangleHeight);
                graphics.drawLine(x + triangleBase / 2, yStart - triangleHeight, x + triangleBase, yStart);
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