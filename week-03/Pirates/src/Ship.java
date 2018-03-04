import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> crew;
  Pirate captain;
  //Captain object will be made when creating a ship
  int score = 0;
  private Random r = new Random();

  public Ship() {
    this.crew = new ArrayList<>();
  }

  public int aliveCounter() {
    int crewAlive = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isAlive) {
        crewAlive++;
      }
    }
    return crewAlive;
  }

  public int passedOutCounter() {
    int crewPassedOut = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).passedOut) {
        crewPassedOut++;
      }
    }
    return crewPassedOut;
  }

  public void crewStatus() {
    for (int i = 0; i < crew.size(); i++) {
      crew.get(i).howIsItGoingMate();
    }
    passedOutCounter();
    score = aliveCounter() - captain.drinkCounter;
    System.out.println("Consumed rum by the captain " + captain.drinkCounter);
    System.out.println("Passed out crew members: " + passedOutCounter() + " of " + crew.size());
    System.out.println("Dead crew members: " + (crew.size() - aliveCounter()) + " of " + crew.size());
    System.out.println("Pirates alive: " + aliveCounter() + " of " + crew.size());
  }

  public void fillShip(Pirate captain) {
    for (int i = 0; i < (r.nextInt(10) + 9); i++) {
      //fill the ship with a captain and with pirates between 10 and 19, and a captain
      Pirate pirate = new Pirate("pirate" + i);
      this.crew.add(pirate);
    }
    this.crew.add(captain);
    //Each member is alive
    this.aliveCounter();
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
        if (ship.crew.get(j).isAlive) {
          ship.crew.get(j).drinkSomeRum();
        }
      }
    }
    System.out.println("..and they had " + roundsOfDrinks + " rounds of rum!");
  }

  private void looseCondition(Ship ship) {
    int losses = r.nextInt(ship.aliveCounter());
    for (int i = 0; i < losses; i++) {
      if (ship.crew.get(i).isAlive || ship.crew.get(i).passedOut) {
        ship.crew.get(i).isAlive = false;
      }
    }
  }

}
