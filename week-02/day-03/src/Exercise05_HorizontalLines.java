import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.Random;

public class Exercise05_HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws 50 horizontal line from that point to the end of the screen.
        // Draw 50 random lines with that function. Use loop for that.

        Random r = new Random();
        int[] startingColorX = new int[50];
        int[] startingColorY = new int[50];

        for (int i = 0; i < 50; i++) {
            startingColorX[i] = r.nextInt(WIDTH);
            startingColorY[i] = r.nextInt(HEIGHT);
        }

        for (int i = 0; i < startingColorX.length; i++) {
            drawHorizontal(graphics, startingColorX[i], startingColorY[i]);
        }

    }
    public static void drawHorizontal(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, WIDTH, y);
    }

    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}