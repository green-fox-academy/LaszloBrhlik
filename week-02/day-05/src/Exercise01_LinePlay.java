import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise01_LinePlay {
    public static void mainDraw(Graphics graphics) {

        int lineOffset = 20;
        drawLines(graphics, lineOffset);

    }

    private static void drawLines(Graphics graphics, int lineOffset) {
        for (int i = 0; i < WIDTH/lineOffset; i++) {
            graphics.setColor(Color.magenta);
            graphics.drawLine(i*lineOffset, 0, WIDTH, i*lineOffset);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, i*lineOffset, i*lineOffset, HEIGHT);
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