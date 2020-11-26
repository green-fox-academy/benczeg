import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        int step = HEIGHT / 2;
        int sraff = 0;
        while (sraff < step) {
            sraff += 5;
            graphics.setColor(Color.green);
            graphics.drawLine(step, step - sraff, sraff, step);
            graphics.drawLine(step, step - sraff, step + step - sraff, step);
            graphics.drawLine(step, step + sraff, sraff, step);
            graphics.drawLine(step, step + sraff, step + step - sraff, step);
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