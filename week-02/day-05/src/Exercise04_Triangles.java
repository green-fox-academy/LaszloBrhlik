import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise04_Triangles {

    public static int triangleNumbers =21 ;
    public static int triangleDots = triangleNumbers + 1;
    public static int triangleSide = 20;
    public static int triangleHeight = (int)Math.sqrt(triangleSide*triangleSide-triangleSide/2*triangleSide/2);
    public static int trianglePositionFromSides = 100;

    public static void mainDraw(Graphics graphics) {
        int[][] leftSideCoords = new int[triangleDots][2];
        int[][] rightSideCoords = new int[triangleDots][2];
        int[][] bottomCoords = new int[triangleDots][2];

        fillSideCoords(leftSideCoords, rightSideCoords, bottomCoords);
        connectSides(graphics, leftSideCoords, rightSideCoords, bottomCoords);
    }

    public static void fillSideCoords(int[][] leftSideCoords, int[][] rightSideCoords, int[][] bottomCoords) {
        for (int i = 0; i < triangleDots; i++) {
            leftSideCoords[i][0] = triangleSide/2*(triangleNumbers-i)+trianglePositionFromSides;
            leftSideCoords[i][1] = triangleHeight*i+trianglePositionFromSides;
            rightSideCoords[i][0] = triangleSide/2*(triangleNumbers+i)+trianglePositionFromSides;
            rightSideCoords[i][1] = triangleHeight*i+trianglePositionFromSides;
            bottomCoords[i][0] = triangleSide*i+trianglePositionFromSides;
            bottomCoords[i][1] = triangleNumbers*triangleHeight+trianglePositionFromSides;
        }
    }

    private static void connectSides(Graphics graphics, int[][] leftSideCoords, int[][] rightSideCoords,
                                     int[][] bottomCoords) {
        for (int i = 0, j = triangleDots-1; i < triangleDots && j >= 0; i++, j--) {
            graphics.drawLine(leftSideCoords[i][0], leftSideCoords[i][1], rightSideCoords[i][0], rightSideCoords[i][1]);
            graphics.drawLine(leftSideCoords[i][0], leftSideCoords[i][1], bottomCoords[j][0], bottomCoords[j][1]);
            graphics.drawLine(rightSideCoords[i][0], rightSideCoords[i][1], bottomCoords[i][0], bottomCoords[i][1]);
        }
    }

    // Don't touch the code below
    //BL note: canvas width and height also updated to follow dynamically the numbers of triangles
    static int WIDTH = triangleNumbers*triangleSide+2*trianglePositionFromSides;
    static int HEIGHT = triangleNumbers*triangleHeight+2*trianglePositionFromSides;

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