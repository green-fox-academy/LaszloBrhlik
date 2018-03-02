import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochSnowflake {

  public static void mainDraw(Graphics graphics) {

    int level = 8;

    for (int i = 1; i < level; i++) {
      graphics.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));

      drawSnowflake(graphics, i,WIDTH/2, 0, WIDTH, WIDTH*3/4);
      drawSnowflake(graphics, i,WIDTH, WIDTH*3/4, 0, WIDTH*3/4);
      drawSnowflake(graphics, i,0, WIDTH*3/4, WIDTH/2, 0);
    }

    for (int i = 1; i < level; i++) {
      drawSnowflake2(graphics, i,WIDTH/2, 0, WIDTH, WIDTH*3/4);
      drawSnowflake2(graphics, i,WIDTH, WIDTH*3/4, 0, WIDTH*3/4);
      drawSnowflake2(graphics, i,0, WIDTH*3/4, WIDTH/2, 0);
    }

  }

  public static void drawSnowflake(Graphics graphics, int level, int x1, int y1, int x5, int y5) {

    int deltax, deltay, x2,y2,x3,y3,x4,y4;

    if (level==1) {

      graphics.drawLine(x1, y1, x5, y5);

    } else {

      deltax = x5-x1;
      deltay = y5-y1;

      x2 = x1 + deltax/3;
      y2 = y1 + deltay/3;

      x3 = (int) (0.5 * (x1 + x5) + Math.sqrt(3) * (y5-y1) / 6);
      y3 = (int) (0.5 * (y1 + y5) + Math.sqrt(3) * (x1-x5) / 6);

      x4 = x1 + deltax*2/3;
      y4 = y1 + deltay*2/3;

      //graphics.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));

      drawSnowflake(graphics, level-1, x1, y1, x2, y2);
      drawSnowflake(graphics, level-1, x2, y2, x3, y3);
      drawSnowflake(graphics, level-1, x3, y3, x4, y4);
      drawSnowflake(graphics, level-1, x4, y4, x5, y5);

    }
  }


  public static void drawSnowflake2(Graphics graphics, int level, int x1, int y1, int x5, int y5) {

    int deltax, deltay, x2,y2,x3,y3,x4,y4;

    if (level==1) {

      graphics.drawLine(x1, y1, x5, y5);

    } else {

      deltax = x5-x1;
      deltay = y5-y1;

      x2 = x1 + deltax/3;
      y2 = y1 + deltay/3;

      x3 = (int) (0.5 * (x1 + x5) + Math.sqrt(3) * (y1-y5) / 6);
      y3 = (int) (0.5 * (y1 + y5) + Math.sqrt(3) * (x5-x1) / 6);

      x4 = x1 + deltax*2/3;
      y4 = y1 + deltay*2/3;

      drawSnowflake2(graphics, level-1, x1, y1, x2, y2);
      drawSnowflake2(graphics, level-1, x2, y2, x3, y3);
      drawSnowflake2(graphics, level-1, x3, y3, x4, y4);
      drawSnowflake2(graphics, level-1, x4, y4, x5, y5);

    }
  }

  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 840;

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
      this.setBackground(Color.black);
    }
  }
}