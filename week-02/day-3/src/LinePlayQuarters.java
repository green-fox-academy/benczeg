import javax.swing.*;

import java.awt.*;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int Start = 0;
        int End = HEIGHT / 8; // =WIDTH
        int xStand = 0;
        int yStand = (HEIGHT / 8); // = WIDTH-5
        //int csere;
        for (int i = 0; i < 8; i++) {
           // Start += i * HEIGHT / 8;
            //End += i * HEIGHT / 8;
            //csere = Start;
            //Start = End;
            //End = csere;
            Start = 0;
            End = HEIGHT/8;
            xStand += i * HEIGHT / 8 ;
            yStand += i * HEIGHT / 8;
            while (Start < (HEIGHT / 8 )) {
                Start += 5;
                End -= 5;
                graphics.setColor(Color.green);
                graphics.drawLine(xStand, Start, Start, yStand);
                graphics.setColor(Color.MAGENTA);
                graphics.drawLine(yStand, End, End, xStand);
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