import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PokerLogicTest {

  PokerLogic pokerLogic = new PokerLogic();

  @Test
  public void testHighestCard() {
    // Arrange
    List<String> black = new ArrayList<>(Arrays.asList("2H", "3D", "5S", "9C", "KD"));
    List<String> white = new ArrayList<>(Arrays.asList("2C", "3H", "4S", "8C", "AH"));
    String expectedResult = "White wins! - (High card: A)";

    // Act
    String result = pokerLogic.getResult(black, white);

    // Assert
    assertEquals(expectedResult, result);
  }

  @Test
  public void testHigherCard() {
    // Arrange
    List<String> black = new ArrayList<>(Arrays.asList("2H", "3D", "5S", "9C", "KD"));
    List<String> white = new ArrayList<>(Arrays.asList("2C", "3H", "4S", "8C", "KH"));
    String expectedResult = "Black wins! - (High card: 9)";

    // Act
    String result = pokerLogic.getResult(black, white);

    // Assert
    assertEquals(expectedResult, result);
  }

  @Test
  public void testHighCardTie() {
    // Arrange
    List<String> black = new ArrayList<>(Arrays.asList("2H", "3D", "5S", "9C", "KD"));
    List<String> white = new ArrayList<>(Arrays.asList("2D", "3H", "5C", "9S", "KH"));
    String expectedResult = "Tie";

    // Act
    String result = pokerLogic.getResult(black, white);

    // Assert
    assertEquals(expectedResult, result);
  }

  @Test
  public void testUnorderedHigherCard() {
    // Arrange
    List<String> black = new ArrayList<>(Arrays.asList("KD", "2H", "3D", "5S", "9C"));
    List<String> white = new ArrayList<>(Arrays.asList("2D", "3H", "5C", "9S", "KH"));
    String expectedResult = "Tie";

    // Act
    String result = pokerLogic.getResult(black, white);

    // Assert
    assertEquals(expectedResult, result);
  }

/*  @Test
  public void checkFlush() {
    // Arrange
    List<String> black = new ArrayList<>(Arrays.asList("2H", "4S", "4C", "2D", "4H"));
    List<String> white = new ArrayList<>(Arrays.asList("2S", "8S", "AS", "QS", "3S"));
    String expectedResult = "White wins! - (Flush: A)";

    // Act
    String result = pokerLogic.getResult(black, white);

    // Assert
    assertEquals(expectedResult, result);
  }*/
}
