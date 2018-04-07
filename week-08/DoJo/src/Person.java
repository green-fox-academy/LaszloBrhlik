import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

  private List<Card> hand;
  private String name;
  private double ranking;

  public Person(String name, List<Card> hand) {
    ranking = 0;
    this.name = name;
    this.hand = hand;
  }

  public Person(String name, String card1, String card2, String card3, String card4, String card5) {
    ranking = 10;
    this.name = name;
    hand = new ArrayList<>(Arrays.asList(
            declareCard(card1),
            declareCard(card2),
            declareCard(card3),
            declareCard(card4),
            declareCard(card5)
    ));
  }

  public Card declareCard(String card) {
    return new Card(declareValue(card), declareSuit(card));
  }

  public static int declareValue(String card) {
    int tempValue = 0;
    if (card.startsWith("A")) {
      tempValue = 14;
    } else if (card.startsWith("K")) {
      tempValue = 13;
    } else if (card.startsWith("Q")) {
      tempValue = 12;
    } else if (card.startsWith("J")) {
      tempValue = 11;
    } else if (card.startsWith("T")) {
      tempValue = 10;
    } else if (card.startsWith("9")) {
      tempValue = 9;
    } else if (card.startsWith("8")) {
      tempValue = 8;
    } else if (card.startsWith("7")) {
      tempValue = 7;
    } else if (card.startsWith("6")) {
      tempValue = 6;
    } else if (card.startsWith("5")) {
      tempValue = 5;
    } else if (card.startsWith("4")) {
      tempValue = 4;
    } else if (card.startsWith("3")) {
      tempValue = 3;
    } else if (card.startsWith("2")) {
      tempValue = 2;
    } else {
      System.out.println("Please check if values are correct!?");
      System.exit(0);
    }
    return tempValue;
  }

  public int declareSuit(String card) {
    int tempSuit = 0;
    if (card.endsWith("C")) {
      tempSuit = 1;
    } else if (card.endsWith("D")) {
      tempSuit = 2;
    } else if (card.endsWith("H")) {
      tempSuit = 3;
    } else if (card.endsWith("S")) {
      tempSuit = 4;
    } else {
      System.out.println("Please check if suits are correct!?");
      System.exit(0);
    }
    return tempSuit;
  }

  public List<Card> getHand() {
    return hand;
  }

  public String getName() {
    return name;
  }

  public double getRanking() {
    return ranking;
  }

  public void setRanking(double ranking) {
    this.ranking = ranking;
  }
}
