import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGraphics1 {

  public static void mainDraw(Graphics graphics) {

    drawSquares(graphics,7, 0,0,800);
  }

  public static void drawSquares(Graphics graphics, int level, int startX, int startY, int size) {
    if (level == 1) {
      int startX0 = 0;
      int startY0 = 0;
      int startingSize = 800;
      graphics.drawRect(startX0,startY0,startingSize, startingSize);
    } else {
      int startX1 = startX + size/3;
      int startY1 = startY + 0;
      int startX2 = startX + 0;
      int startY2 = startY +size/3;
      int startX3 = startX + size*2/3;
      int startY3 = startY +size/3;
      int startX4 = startX + size/3;
      int startY4 = startY +size*2/3;

      graphics.drawRect(startX1, startY1, size/3, size/3);
      graphics.drawRect(startX2, startY2, size/3, size/3);
      graphics.drawRect(startX3, startY3, size/3, size/3);
      graphics.drawRect(startX4, startY4, size/3, size/3);

      drawSquares(graphics, level-1, startX1, startY1, size/3);
      drawSquares(graphics, level-1, startX2, startY2, size/3);
      drawSquares(graphics, level-1, startX3, startY3, size/3);
      drawSquares(graphics, level-1, startX4, startY4, size/3);
    }
  }

  /*

  This is just and idea how to divide lines in exact parts

  public static void drawLines(Graphics graphics, int startX, int startY, int width) {
    if (width > 1) {

      graphics.drawLine(startX, startY, startX + width, startY);
      startY += width / 3;
      drawLines(graphics, startX, startY, width / 3);
      drawLines(graphics, startX + width * 2 / 3, startY, width / 3);
    }
  }
  */

  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

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
      this.setBackground(Color.WHITE);
    }
  }
}
