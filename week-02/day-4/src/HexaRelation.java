import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexaRelation {
    public static void mainDraw(Graphics graphics) {
        int x = 100;
        int y = 100;
        int a = 50;
        DrawBigger(graphics, x, y, a);
        DrawEven(graphics, x, y, a);
        DrawSmaller(graphics, x, y, a);


    }

    private static void DrawSmaller(Graphics graphics, int x, int y, int a) {
        graphics.drawLine(x, y + ((int) (Math.sqrt(3) * a)), x + a / 2, y);
        graphics.drawLine(x, y - ((int) (Math.sqrt(3) * a)), x + a / 2, y);
    }

    private static void DrawEven(Graphics graphics, int x, int y, int a) {
        graphics.drawLine(x, y + ((int) (Math.sqrt(3) * a)), x + a, y + ((int) (Math.sqrt(3) * a)));
        graphics.drawLine(x, y - ((int) (Math.sqrt(3) * a)), x + a, y - ((int) (Math.sqrt(3) * a)));
    }

    private static void DrawBigger(Graphics graphics, int x, int y, int a) {
        graphics.drawLine(x, y, x + a / 2, y + ((int) (Math.sqrt(3) * a)));
        graphics.drawLine(x, y, x + a / 2, y - ((int) (Math.sqrt(3) * a)));
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