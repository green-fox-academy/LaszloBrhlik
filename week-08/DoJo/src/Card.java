public class Card {

  private int value;
  private int suit;

  public Card(int value, int suit) {
    this.suit = suit;
    this.value = value;
  }

  public int getSuit() {
    return suit;
  }

  public int getValue() {
    return value;
  }

  public void setSuit(int suit) {
    this.suit = suit;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
