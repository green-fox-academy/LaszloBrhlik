import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PokerLogic {

  private PokerTable pokerTable;
  private double currentRanking;

  public PokerLogic(PokerTable pokerTable) {
    this.pokerTable = pokerTable;
    results();
  }

  public void results() {
    handRanking(pokerTable.getPerson(0));
    handRanking(pokerTable.getPerson(1));

    if (pokerTable.getPerson(0).getRanking() > pokerTable.getPerson(1).getRanking()) {
      System.out.println(pokerTable.getPerson(0).getName() + " wins!");
    } else if (pokerTable.getPerson(0).getRanking() < pokerTable.getPerson(1).getRanking()) {
      System.out.println(pokerTable.getPerson(1).getName() + " wins!");
    } else {
      System.out.println("It's a tie!");
    }

    System.out.printf(pokerTable.getPerson(0).getName() + "'s rank is: %.2f\n", pokerTable.getPerson(0).getRanking());
    System.out.printf(pokerTable.getPerson(1).getName() + "'s rank is: %.2f\n", pokerTable.getPerson(1).getRanking());

    if (pokerTable.getPerson(0).getRanking() == 10 || pokerTable.getPerson(1).getRanking() == 10) {
      System.out.println("#### ROYAL FLUSH ####");
    }
  }

  public void handRanking(Person person) {
    currentRanking = 0;

    // Get an ordered list
    List<Card> temp = person.getHand();
    temp.sort(Comparator.comparing(o -> o.getValue()));

    // Check ranking
    isHighCard(temp, currentRanking);
    isPair(temp, currentRanking);
    isTwoPair(temp, currentRanking);
    isThreeOfAKind(temp, currentRanking);
    isStraight(temp, currentRanking);
    isFlush(temp, currentRanking);
    isFullHouse(temp, currentRanking);
    isFourOfAKind(temp, currentRanking);
    isStraightFlush(temp, currentRanking);
    isRoyalFlush(getHighCard(temp), currentRanking);

    // Set person ranking
    person.setRanking(currentRanking);
  }

  public double getHighCard(List<Card> temp) {
    double highCard = temp.stream()
            .map(c -> c.getValue())
            .collect(Collectors.summarizingInt(Integer::intValue)).getMax();
    return highCard;
  }

  public void isHighCard(List<Card> temp, double ranking) {
    currentRanking = 1 + getHighCard(temp) * 0.01;
  }

  public void isPair(List<Card> temp, double ranking) {
    for (int i = 0; i < temp.size() - 1; i++) {
      if (temp.get(i).getValue() == temp.get(i + 1).getValue()) {
        currentRanking = 2 + (temp.get(i).getValue() * 0.01);
      }
    }
  }

  public void isTwoPair(List<Card> temp, double ranking) {
    int countPairs = 0;
    double tempResult = 0;
    for (int i = 0; i < temp.size() - 1; i++) {
      if (temp.get(i).getValue() == temp.get(i + 1).getValue()) {
        tempResult = temp.get(i).getValue() * 0.01;
        countPairs++;
      }
    }
    if (countPairs == 2) {
      currentRanking = 3 + tempResult;
    }
  }

  public void isThreeOfAKind(List<Card> temp, double ranking) {
    for (int i = 0; i < temp.size() - 2; i++) {
      if (temp.get(i).getValue() == temp.get(i + 1).getValue() &&
              temp.get(i).getValue() == temp.get(i + 2).getValue()) {
        currentRanking = 4 + (temp.get(i).getValue() * 0.01);
      }
    }
  }

  public void isStraight(List<Card> temp, double ranking) {
    int countStraight = 0;
    double tempResult = 0;
    for (int i = 0; i < temp.size() - 1; i++) {
      if (temp.get(i).getValue() == temp.get(i + 1).getValue() - 1) {
        tempResult = temp.get(i + 1).getValue() * 0.01;
        countStraight++;
      }
    }
    if (countStraight == 4) {
      currentRanking = 5 + tempResult;
    }
  }

  public void isFlush(List<Card> temp, double ranking) {
    int countFlush = 0;
    double tempResult = 0;
    for (int i = 0; i < temp.size() - 1; i++) {
      if (temp.get(i).getSuit() == temp.get(i + 1).getSuit()) {
        tempResult = temp.get(i + 1).getValue() * 0.01;
        countFlush++;
      }
    }
    if (countFlush == 4) {
      currentRanking = 6 + tempResult;
    }
  }

  public void isFullHouse(List<Card> temp, double ranking) {
    List<Card> fullHouseCards = temp;
    double tempResult = 0;
    for (int i = 0; i < fullHouseCards.size() - 2; i++) {
      if (fullHouseCards.get(i).getValue() == fullHouseCards.get(i + 1).getValue() &&
              fullHouseCards.get(i).getValue() == fullHouseCards.get(i + 2).getValue()) {
        tempResult = temp.get(i).getValue() * 0.01;
        fullHouseCards.remove(i);
        fullHouseCards.remove(i);
        fullHouseCards.remove(i);
        break;
      }
    }
    if (fullHouseCards.size() == 2 && fullHouseCards.get(0) == fullHouseCards.get(1)) {
      tempResult += fullHouseCards.get(0).getValue() * 0.001;
      currentRanking = 7 + tempResult;
    }
  }

  public void isFourOfAKind(List<Card> temp, double ranking) {
    for (int i = 0; i < temp.size() - 3; i++) {
      if (temp.get(i).getValue() == temp.get(i + 1).getValue() &&
              temp.get(i).getValue() == temp.get(i + 2).getValue() &&
              temp.get(i).getValue() == temp.get(i + 3).getValue()) {
        currentRanking = 8 + (temp.get(i).getValue() * 0.01);
      }
    }
  }

  public void isStraightFlush(List<Card> temp, double ranking) {
    int countStraightFlush = 0;
    double tempResult = 0;
    for (int i = 0; i < temp.size() - 1; i++) {
      if (temp.get(i).getValue() == temp.get(i + 1).getValue() - 1 &&
              temp.get(i).getSuit() == temp.get(i + 1).getSuit()) {
        tempResult = temp.get(i + 1).getValue() * 0.01;
        countStraightFlush++;
      }
    }
    if (countStraightFlush == 4) {
      currentRanking = 9 + tempResult;
    }
  }

  public void isRoyalFlush(double highCard, double ranking) {
    if (highCard == 14 && ranking > 9) {
      currentRanking = 10;
    }
  }
}
