import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise10_RainbowBoxes {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        Random r = new Random();
        int[] squareSize = new int[3];

        for (int i = 0; i < squareSize.length; i++) {
            squareSize[i] = r.nextInt(WIDTH);
        }
        drawSquare(graphics, squareSize);

    }

    public static void drawSquare(Graphics graphics, int[] x) {
        for (int i = 0; i < x.length; i++) {
            graphics.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
            graphics.drawRect((WIDTH/2 - x[i]/2), (HEIGHT/2 - x[i]/2), x[i], x[i]);
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