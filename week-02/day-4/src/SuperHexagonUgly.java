import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagonUgly {
    public static void mainDraw(Graphics graphics) {

        int hexagonStartNumbers = 1;
        int hexagonMaxNumber = 4; // mennyi az él darab
        int hexagonBase = WIDTH / (2 * (hexagonMaxNumber + 1)+1); // alap
        int hexagonHeight = (int) (Math.sqrt(3) * hexagonBase);
        int halfStep = hexagonBase / 2;
        int xStart = WIDTH / 2 - halfStep;
        int yStart;
        int yStartFromTop;
        int x;
        int xCount = 0;
        for (int j = 0; j <= hexagonMaxNumber; j++) {
            yStart = HEIGHT - j * hexagonHeight / 2;
            yStartFromTop =(HEIGHT - hexagonHeight*5) + (j) * hexagonHeight/ 2 ;
            xCount++;
            for (int i = 0; i < xCount; i++) {
                x = xStart + i * (hexagonBase * 3);
                //From the bottom up
                graphics.drawLine(x, yStart, x + hexagonBase, yStart); //1
                graphics.drawLine(x + hexagonBase, yStart, x + hexagonBase + hexagonBase / 2, yStart - hexagonHeight / 2); //2
                graphics.drawLine(x + hexagonBase + hexagonBase / 2, yStart - hexagonHeight / 2, x + hexagonBase, yStart - hexagonHeight); //3
                graphics.drawLine(x + hexagonBase, yStart - hexagonHeight, x, yStart - hexagonHeight); //4
                graphics.drawLine(x, yStart - hexagonHeight, x - hexagonBase / 2, yStart - hexagonHeight / 2); //5
                graphics.drawLine(x - hexagonBase / 2, yStart - hexagonHeight / 2, x, yStart); //6

                //From the top down
                graphics.drawLine(x, yStartFromTop, x + hexagonBase, yStartFromTop); //1
                graphics.drawLine(x + hexagonBase, yStartFromTop, x + hexagonBase + hexagonBase / 2, yStartFromTop - hexagonHeight / 2); //2
                graphics.drawLine(x + hexagonBase + hexagonBase / 2, yStartFromTop - hexagonHeight / 2, x + hexagonBase, yStartFromTop - hexagonHeight); //3
                graphics.drawLine(x + hexagonBase, yStartFromTop - hexagonHeight, x, yStartFromTop - hexagonHeight); //4
                graphics.drawLine(x, yStartFromTop - hexagonHeight, x - hexagonBase / 2, yStartFromTop - hexagonHeight / 2); //5
                graphics.drawLine(x - hexagonBase / 2, yStartFromTop - hexagonHeight / 2, x, yStartFromTop); //6
            }
            xStart -= (hexagonBase + halfStep);
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