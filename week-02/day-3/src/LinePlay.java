import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int xStart = 0;
        int yStart = 0;
        int xEnd = WIDTH;
        int yEnd = HEIGHT;
        int xStand = 20;
        int yStand = (HEIGHT - 20); // = WIDTH-20
        while (xStart < (WIDTH - 20)) {
            xStart += 20;
            yStart += 20;
            xEnd -= 20;
            yEnd -= 20;
            graphics.setColor(Color.green);
            graphics.drawLine(xStand, yStart, xStart, yStand);
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(yStand, yEnd, xEnd, xStand);
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