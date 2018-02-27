import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Exercise07_TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("src/win-o.txt"));
    // should print O

    System.out.println(ticTacResult("src/win-x.txt"));
    // should print X

    System.out.println(ticTacResult("src/draw.txt"));
    // should print draw

  }
  public static String ticTacResult(String fileName) {
    try {
      List<String> fileNameLine = Files.readAllLines(Paths.get(fileName));
      CharSequence[] sequence = fileNameLine.toArray(new CharSequence[fileNameLine.size()]);
      String characterString = Arrays.toString(sequence).replace("[", "").replace("]", "")
              .replace(",", "").replace(",", "").replace(" ","");
      int[][] winningCondition = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};
      for (int i = 0; i < winningCondition.length; i++) {
        if (characterString.charAt(winningCondition[i][0]) == 'X' &&
                characterString.charAt(winningCondition[i][1]) == 'X' &&
                characterString.charAt(winningCondition[i][2]) == 'X') {
          return "X";
        } else if (characterString.charAt(winningCondition[i][0]) == 'O' &&
                characterString.charAt(winningCondition[i][1]) == 'O' &&
                characterString.charAt(winningCondition[i][2]) == 'O') {
            return "O";
        }
      }
    } catch (IOException ex) {
      System.out.println("Unable to read files");
    }
    return "draw";
  }
}