import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> crew;
  Pirate captain; //A captain object is not made yet
  int crewAlive = 0;
  int crewPassedOut = 0;
  int score = 0;
  private Random r = new Random();

  public Ship() {
    this.crew = new ArrayList<>();
  }

  public void fillShip(Pirate captain) {
    for (int i = 0; i < (r.nextInt(10) + 9); i++) {
      //fill the ship with a captain and with pirates between 10 and 19, and a captain
      Pirate pirate = new Pirate("pirate"+i);
      this.crew.add(pirate);
    }
    this.crew.add(captain);

    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isAlive) {
        crewAlive++;
      }
    }
  }

  public void crewStatus() {

    for (int i = 0; i < crew.size(); i++) {
      crew.get(i).howIsItGoingMate();
    }
    crewPassedOut = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).passedOut) {
        crewPassedOut++;
      }
    }

    score = crewAlive - captain.drinkCounter;

    System.out.println("Consumed rum by the captain " + captain.drinkCounter);
    System.out.println("Passed out crew members: " + crewPassedOut + " of " + crew.size());
    System.out.println("Dead crew members: " + (crew.size() - crewAlive) + " of " + crew.size());
    System.out.println("Pirates alive: " + crewAlive + " of " + crew.size());
  }

  public void battle(Ship otherShip) {

    if (this.crew.size() >= otherShip.crew.size()) {
      for (int i = 0; i < otherShip.crew.size(); i++) {
        crew.get(i).brawl(otherShip.crew.get(i));
      }
    } else {
      for (int i = 0; i < this.crew.size(); i++) {
        this.crew.get(i).brawl(otherShip.crew.get(i));
      }
    }

    this.crewStatus();
    otherShip.crewStatus();

    if (this.score > otherShip.score) {
      winCondition(this);
      looseCondition(otherShip);
    } else if (this.score < otherShip.score) {
      winCondition(otherShip);
      looseCondition(this);
    } else {
      System.out.println("Score is equal no one has won! :O");
    }
  }

  private void winCondition(Ship ship) {
    System.out.println("Great job captain, " + ship.captain + "!");
    System.out.println("The ship has won!");
    System.out.println("Enjoy the party");
    int roundsOfDrinks = r.nextInt(2) + 1;
    for (int i = 1; i < roundsOfDrinks; i++) {
      for (int j = 0; j < ship.crew.size(); j++) {
        ship.crew.get(j).drinkSomeRum();
      }
    }
    System.out.println("..and they had " + roundsOfDrinks + " rounds of rum!");
  }

  private void looseCondition(Ship ship) {
    int losses = r.nextInt(ship.crew.size());
    for (int i = 0; i < losses; i++) {
      if (ship.crew.get(i).isAlive || ship.crew.get(i).passedOut) {
        ship.crew.get(i).isAlive = false;
      }
    }
  }

}
