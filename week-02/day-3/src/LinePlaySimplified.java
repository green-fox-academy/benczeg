import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlaySimplified {
    public static void mainDraw(Graphics graphics) {

        int start; // +
        int end;   // -
        int stop;  // 0
        int step = HEIGHT / 8;
        int sraff = 5;

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {


                start = i *  step;
                end = start + step;
                stop = i *  step;

                while (start < ((i + 1) * step)) {
                    start += sraff;
                    end -= sraff;
                    graphics.setColor(Color.green);
                    graphics.drawLine(stop, start, end, stop);
                    graphics.setColor(Color.MAGENTA);
                    graphics.drawLine(start, stop + step, stop + step, end);
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