import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MoonFox {
    public static void mainDraw(Graphics graphics) {

        drawStars(graphics);
        drawMoon(graphics);
        drawGreenFox(graphics);
    }

    private static void drawGreenFox(Graphics graphics) {
        int[] x = new int[8];
        int[] y = new int[8];
        Integer[][] coords = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        for (int i = 0; i < 8; i++) {
            x[i] = coords[i][0] + 270;
            y[i] = coords[i][1] + 400;
            graphics.setColor(Color.green);
        }
        graphics.fillPolygon(x, y, 8);
    }

    private static void drawStars(Graphics graphics) {
        int stars = 2;
        int color;
        int x;
        int y;
        for (int i = 0; i < 300; i++) {
            color = (int) (Math.random() * 256);
            x = (int) (Math.random() * WIDTH);
            y = (int) (Math.random() * HEIGHT);
            graphics.setColor(new Color(color, color, color));
            graphics.drawRect(x, y, stars, stars);
        }
    }

    private static void drawMoon(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillOval(WIDTH / 4, HEIGHT / 4, WIDTH / 2, HEIGHT / 2);
        graphics.setColor(Color.YELLOW);
        graphics.fillArc(WIDTH / 4, HEIGHT / 4, WIDTH / 2, HEIGHT / 2, 90, 180);
        graphics.setColor(Color.YELLOW);
        graphics.setColor(Color.BLACK);
        graphics.fillArc(3 * (WIDTH / 8), HEIGHT / 4, WIDTH / 4, HEIGHT / 2, 90, 180);
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