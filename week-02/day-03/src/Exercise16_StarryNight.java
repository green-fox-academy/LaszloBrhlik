import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise16_StarryNight {

    public static Random r = new Random();
    public static int starSize = 10;

    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        int starNumbers = 101;
        int[][] starCoords = new int[starNumbers][2];

        fillRandomStarCoords(starCoords);
        drawStars(graphics, starCoords);

    }

    public static void fillRandomStarCoords(int[][] starCoords) {
        for (int i = 0; i < starCoords.length; i++) {
            starCoords[i][0] = r.nextInt(WIDTH);
            starCoords[i][1] = r.nextInt(HEIGHT);
        }
    }

    public static void drawStars(Graphics graphics, int[][] starCoords) {
        for (int i = 0; i < starCoords.length; i++) {
            float randomGreyColor = r.nextFloat();
            graphics.setColor(new Color(randomGreyColor, randomGreyColor, randomGreyColor));
            graphics.fillOval(starCoords[i][0], starCoords[i][1], starSize, starSize);
        }
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
            this.setBackground(Color.BLACK);
        }
    }
}