import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise08_PositionSquare {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

        Random r = new Random();
        int[] startingCoordsX = new int[3];
        int[] startingCoordsY = new int[3];

        for (int i = 0; i < startingCoordsX.length; i++) {
            startingCoordsX[i] = r.nextInt(WIDTH);
            startingCoordsY[i] = r.nextInt(HEIGHT);
        }

        drawSquare(graphics, startingCoordsX, startingCoordsY);
    }
    public static void drawSquare(Graphics graphics, int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            graphics.drawRect(x[i], y[i], 50, 50);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}