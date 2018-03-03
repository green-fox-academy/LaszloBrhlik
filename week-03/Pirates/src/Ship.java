import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> crew;
  Pirate captain; //A captain object is not made yet
  int crewAlive = 0;
  int crewPassedOut = 0;
  boolean isWin = false;
  int score = 0;
  Random r = new Random();

  public Ship() {
    this.crew = new ArrayList<>();
  }

  public void fillShip(Pirate pirate, Pirate captain) {
    for (int i = 0; i < (r.nextInt(20) + 20); i++) {
      //fill the ship with a captain and with pirates between 20 and 39
      this.crew.add(pirate);
    }
    this.crew.add(captain);
  }

  public void crewStatus() {
    System.out.println("Consumed rum by the captain " + captain.drinkCounter);
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isAlive) {
        crewAlive++;
      }
      if (crew.get(i).passedOut) {
        crewPassedOut++;
      }
    }
    System.out.println("Passed out crew members: " + crewPassedOut + " of " + crew.size());
    System.out.println("Dead crew members: " + (crew.size() - crewAlive) + " of " + crew.size());
    System.out.println("Pirates alive: " + crewAlive + " of " + crew.size());
  }

  public void calculatedScore() {
    score = crewAlive - captain.drinkCounter;
  }

  public void battle(Ship otherShip) {
    if (this.score > otherShip.score) {
      winCondition(this);
      looseCondition(otherShip);
    } else if (this.score < otherShip.score) {
      winCondition(otherShip);
      looseCondition(this);
    } else {
      System.out.println("Score is equal no one has won!");
    }
  }

  private void winCondition(Ship ship) {
    System.out.println("Great job captain, " + ship.captain + "!");
    System.out.println("The ship has won!");
    System.out.println("Enjoy the party");
    int roundsOfDrinks = r.nextInt(2) + 1;
    for (int i = 1; i < roundsOfDrinks; i++) {
      for (int j = 0; j < crew.size(); j++) {
        crew.get(j).drinkSomeRum();
      }
    }
    System.out.println("..and they had " + roundsOfDrinks + " rounds of rum!");
  }

  private void looseCondition(Ship ship) {
    int losses = r.nextInt(crew.size());
    for (int i = 0; i < losses; i++) {
      if (crew.get(i).isAlive || crew.get(i).passedOut) {
        crew.get(i).isAlive = false;
      }
    }
  }

}
