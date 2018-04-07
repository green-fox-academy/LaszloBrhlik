import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerTable implements Random {

  private List<Person> people;
  private List<Card> deck;

  public PokerTable() {
    people = new ArrayList<>();
    deck = new ArrayList<>();
    fillDeck();
    fillPeople();
  }

  public PokerTable(Person person1, Person person2) {
    people = new ArrayList<>(Arrays.asList(person1, person2));
    deck = new ArrayList<>();
  }

  public void fillDeck() {
    for (int i = 1; i < 5; i++) {
      for (int j = 2; j < 15; j++) {
        deck.add(new Card(i, j));
      }
    }
  }

  public void fillPeople() {
    people.add(new Person("Black", fillRandomHand()));
    people.add(new Person("White", fillRandomHand()));
  }

  public List<Card> fillRandomHand() {
    List<Card> hand = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      int randomCard = random(0, deck.size());
      hand.add(deck.get(randomCard));
      deck.remove(deck.get(randomCard));
    }
    return hand;
  }

  public Person getPerson(int i) {
    if (i == 0 || i == 1) {
      return people.get(i);
    } else {
      return null;
    }
  }

  @Override
  public int random(int lowerBound, int upperBound) {
    int range = (upperBound - lowerBound) + 1;
    return ((int) (Math.random() * range) + lowerBound);
  }
}
