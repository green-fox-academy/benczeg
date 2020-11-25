/*
//Ez egy moslék.... a scanner bekavarta, utána egymásba ágyazott method-ok kavartak be
// a feladatot értem, megy.... de a scanner brrrrrrr







import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        //LineToCenter(graphics);


    }

    //public static void LineToCenter(int x, int y) {
      //  graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
   // }

    // Don't touch the code below
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
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Please give x coordinate:");
        x = scanner.nextInt();
        System.out.println("Please give y coordinate:");
        y = scanner.nextInt();
        //LineToCenter(x,y);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}*/