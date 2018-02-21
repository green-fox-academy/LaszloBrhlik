import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise13_Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int checkerboardSize = 20;
        int checkerboardStartX;
        int checkerboardStartY;

        for (int x = 0; x < WIDTH/checkerboardSize; x++) {
            checkerboardStartX = x * checkerboardSize;
            if (x % 2 == 0) {
                checkerboardStartY = 0;
                for (int y = 0; y < HEIGHT/checkerboardSize; y++) {
                    graphics.fillRect(checkerboardStartX, checkerboardStartY, checkerboardSize, checkerboardSize);
                    checkerboardStartY += 2*checkerboardSize;
                }
            } else {
                checkerboardStartY = checkerboardSize;
                for (int y = 0; y < HEIGHT/checkerboardSize; y++) {
                    graphics.fillRect(checkerboardStartX, checkerboardStartY, checkerboardSize, checkerboardSize);
                    checkerboardStartY += 2*checkerboardSize;
                }
            }
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
        }
    }
}