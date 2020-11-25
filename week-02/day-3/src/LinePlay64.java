import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay64 {
    public static void mainDraw(Graphics graphics) {
        int step = WIDTH / 8;
        int sraff = 5;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int xStart = j * step;
                int yStart = i * step;
                int xEnd = (j + 1) * step;
                int yEnd = (i + 1) * step;
                int startStand = j * step;
                int endStand = i * step;
                while (xStart < ((j + 1) * step)) {
                    xStart += sraff;
                    yStart += sraff;
                    xEnd -= sraff;
                    yEnd -= sraff;
                    graphics.setColor(Color.green);
                    graphics.drawLine(startStand, yStart, xEnd, endStand);
                    graphics.setColor(Color.MAGENTA);
                    graphics.drawLine(xStart, endStand + step, startStand + step, yEnd);
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