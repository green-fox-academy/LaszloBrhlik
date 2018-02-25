import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise05_SuperHexagon {

    // this is not working yet!!

    public static int hexagonLevels = 3;
    public static int hexagonSide = 20;
    public static int hexagonHeight = (int)Math.sqrt(3*hexagonSide*hexagonSide);
    public static int[] pointX = new int[5];
    public static int[] pointY = new int[5];
    public static int[][] additionX = {
            {0, -hexagonSide/2, -hexagonSide*3/2, 0, hexagonSide},
            {0, hexagonSide/2, 0, hexagonSide*3/2, hexagonSide*2},
            {0, hexagonSide, hexagonSide*3/2, hexagonSide*3/2, hexagonSide},
            {0, hexagonSide/2, hexagonSide*3/2, 0, -hexagonSide},
            {0, -hexagonSide/2, 0, -hexagonSide*3/2, -hexagonSide*2},
            {0, -hexagonSide, -hexagonSide*3/2, -hexagonSide*3/2, -hexagonSide}
    };
    public static int[][] additionY = {
            {0, -hexagonHeight/2, -hexagonHeight/2, -hexagonHeight, -hexagonHeight},
            {0, -hexagonHeight/2, -hexagonHeight, -hexagonHeight/2, 0},
            {0, 0, -hexagonHeight/2, hexagonHeight/2, hexagonHeight},
            {0, hexagonHeight/2, hexagonHeight/2, hexagonHeight, hexagonHeight},
            {0, hexagonHeight/2, hexagonHeight, hexagonHeight/2, 0},
            {0, 0, hexagonHeight/2, -hexagonHeight/2, -hexagonHeight}
    };

    public static void mainDraw(Graphics graphics) {
        int x0 = WIDTH / 2 - hexagonSide / 2;
        int y0 = HEIGHT / 2 - hexagonHeight / 2;
        int x1 = WIDTH / 2 + hexagonSide / 2;
        int y1 = HEIGHT / 2 - hexagonHeight / 2;
        int x2 = WIDTH / 2 + hexagonSide;
        int y2 = HEIGHT / 2;
        int x3 = WIDTH / 2 + hexagonSide / 2;
        int y3 = HEIGHT / 2 + hexagonHeight / 2;
        int x4 = WIDTH / 2 - hexagonSide / 2;
        int y4 = HEIGHT / 2 + hexagonHeight / 2;
        int x5 = WIDTH / 2 - hexagonSide;
        int y5 = HEIGHT / 2;

        int[] startingHexagonCoordsX = {x0, x1, x2, x3, x4, x5};
        int[] startingHexagonCoordsY = {y0, y1, y2, y3, y4, y5};
        graphics.drawPolygon(startingHexagonCoordsX, startingHexagonCoordsY, startingHexagonCoordsX.length);

        for (int i = 0; i < startingHexagonCoordsX.length; i++) {
            drawHexagonAddition(graphics, startingHexagonCoordsX[i], startingHexagonCoordsY[i], additionX[i], additionY[i]);
            System.out.println(Arrays.toString(additionX[i]));
        }
    }

    private static void drawHexagonAddition(Graphics graphics, int x, int y, int[] additionX, int[] additionY) {
        while (hexagonLevels >0) {
            for (int k = 0; k < additionX.length; k++) {
                pointX[k] = x + additionX[k];
                pointY[k] = y + additionY[k];
            }
            graphics.drawLine(pointX[0], pointY[0], pointX[1], pointY[1]);
            graphics.drawLine(pointX[1], pointY[1], pointX[2], pointY[2]);
            graphics.drawLine(pointX[1], pointY[1], pointX[3], pointY[3]);
            graphics.drawLine(pointX[3], pointY[3], pointX[4], pointY[4]);
            hexagonLevels -= 1;

            System.out.println(Arrays.toString(additionX));
            drawHexagonAddition(graphics, pointX[2], pointY[2], additionX, additionY);
        }
    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}


// create a 300x300 canvas.