import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Globe {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.white);
        graphics.fillArc(0, 0, WIDTH, HEIGHT, 0, 360);
        graphics.setColor(Color.black);
        for (int i = 1; i < 50; i++) {

            graphics.drawArc(0, 0, WIDTH, HEIGHT / i, 0, 180);
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
            setBackground(Color.black);
            mainDraw(graphics);
        }
    }
}