import java.util.Comparator;
import java.util.List;

public class PokerLogic {

  public String getResult(List<String> black, List<String> white) {

    black.sort(Comparator.comparing(o -> decodeValue(o)));
    white.sort(Comparator.comparing(o -> decodeValue(o)));

    String name = "";
    String cardValue = "";

    return checkHighCard(black, white, name, cardValue);
  }

  public int decodeValue(String card) {
    if (card.startsWith("T")) {
      return 10;
    } else if (card.startsWith("J")) {
      return 11;
    } else if (card.startsWith("Q")) {
      return 12;
    } else if (card.startsWith("K")) {
      return 13;
    } else if (card.startsWith("A")) {
      return 14;
    }
    return Integer.parseInt(((Character) card.charAt(0)).toString());
  }

  public int whoHasHigherCard(String first, String second) {
    if (decodeValue(first) > decodeValue(second)) {
      return -1;
    } else if (decodeValue(first) < decodeValue(second)) {
      return 1;
    } else {
      return 0;
    }
  }

  public String checkHighCard(List<String> black, List<String> white, String name, String cardValue) {
    for (int i = 4; i >= 0; i--) {
      if (whoHasHigherCard(black.get(i), white.get(i)) == -1) {
        name = "Black";
        cardValue = ((Character) black.get(i).charAt(0)).toString();
        break;
      } else if (whoHasHigherCard(black.get(i), white.get(i)) == 1) {
        name = "White";
        cardValue = ((Character) white.get(i).charAt(0)).toString();
        break;
      }
    }
    if (name.isEmpty()) {
      return "Tie";
    } else {
      return name + " wins! - (High card: " + cardValue + ")";
    }
  }
}
