import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise07_FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles
        // BL note: random sizes and colors
        // avoid code duplication.

        Random r = new Random();
        int[] topLeftCoordsOfX = new int[4];
        int[] topLeftCoordsOfY = new int[4];
        int[] widthOfRectangles = new int[4];
        int[] heightOfRectangles = new int[4];

        for (int i = 0; i < topLeftCoordsOfX.length; i++) {
            topLeftCoordsOfX[i] = r.nextInt(WIDTH/2);
            topLeftCoordsOfY[i] = r.nextInt(HEIGHT/2);
            widthOfRectangles[i] = r.nextInt(WIDTH/2);
            heightOfRectangles[i] = r.nextInt(HEIGHT/2);
        }

        for (int i = 0; i < topLeftCoordsOfX.length; i++) {
            float red = r.nextFloat();
            float green = r.nextFloat();
            float blue = r.nextFloat();
            Color randomColor = new Color(red, green, blue);
            graphics.setColor(randomColor);
            graphics.drawRect(topLeftCoordsOfX[i], topLeftCoordsOfY[i], widthOfRectangles[i], heightOfRectangles[i]);
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