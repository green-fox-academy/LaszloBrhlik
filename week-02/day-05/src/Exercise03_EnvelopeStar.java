import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise03_EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int lineOffset = 10;
        drawLines(graphics, lineOffset);
    }

    private static void drawLines(Graphics graphics, int lineOffset) {
        for (int i = 0; i < WIDTH/(2*lineOffset); i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(WIDTH/2, i*lineOffset, (WIDTH/2)-i*lineOffset, HEIGHT/2 );
            graphics.drawLine(WIDTH/2, i*lineOffset, (WIDTH/2)+i*lineOffset, HEIGHT/2 );
            graphics.drawLine(WIDTH/2, HEIGHT-i*lineOffset, (WIDTH/2)-i*lineOffset, HEIGHT/2 );
            graphics.drawLine(WIDTH/2, HEIGHT-i*lineOffset, (WIDTH/2)+i*lineOffset, HEIGHT/2 );
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