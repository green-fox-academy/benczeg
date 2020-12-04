import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(String[] args) {
        int a = 720;
        drawSquares(a);
    }

// 4 vonallal esetleg....

    public static void drawSquares(int a) {
        if (a <= 1) {

        } else {
            graphics.drawLine(0, (int) a / 3, a, a / 3);
            graphics.drawLine(0, 2 * a / 3, a, 2 * a / 3);
            graphics.drawLine(a / 3, 0, a / 3, a);
            graphics.drawLine(2 * a / 3, 0, 2 * a / 3, a);
            a = a / 3;
            drawSquares(a);

        }
    }

    static int WIDTH = 320;
    static int HEIGHT = 320;

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
