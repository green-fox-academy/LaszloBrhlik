import java.util.Comparator;
import java.util.List;

public class PokerLogic {
  private String name = "";
  private String cardValue = "";

  public String getResult(List<String> black, List<String> white) {

    black.sort(Comparator.comparing(o -> decodeValue(o)));
    white.sort(Comparator.comparing(o -> decodeValue(o)));

    checkHighCard(black, white, name, cardValue);
    return result(name, cardValue);
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

  public void checkHighCard(List<String> black, List<String> white, String name, String cardValue) {
    for (int i = 4; i >= 0; i--) {
      if (whoHasHigherCard(black.get(i), white.get(i)) == -1) {
        this.name = "Black";
        this.cardValue = ((Character) black.get(i).charAt(0)).toString();
        break;
      } else if (whoHasHigherCard(black.get(i), white.get(i)) == 1) {
        this.name = "White";
        this.cardValue = ((Character) white.get(i).charAt(0)).toString();
        break;
      }

    }
  }

  public String result(String name, String cardValue) {
    if (name.isEmpty()) {
      return "Tie";
    } else {
      return name + " wins! - (High card: " + cardValue + ")";
    }
  }
}
