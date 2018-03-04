import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> crew;
  Pirate captain;
  //Pirate object captain has to be initialized in 'main'
  int score = 0;
  boolean isDestroyed = false;
  private Random r = new Random();

  public Ship(Pirate captain) {
    this.crew = new ArrayList<>();
    this.captain = captain;
    this.crew.add(this.captain);
    //Captain added to the crew as the first member
  }

  public int aliveCounter() {
    int crewAlive = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isAlive) {
        crewAlive++;
      }
    }
    //Even passed out members are alive!
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
    System.out.println("<---- "+crew.get(0).pirate+"'s ship ---->");
    for (int i = 0; i < crew.size(); i++) {
      crew.get(i).howIsItGoingMate();
    }
    passedOutCounter();
    score = aliveCounter() - captain.drinkCounter;
    System.out.println("Consumed rum by the captain " + captain.drinkCounter);
    System.out.println("Passed out crew members: " + passedOutCounter() + " of " + crew.size());
    System.out.println("Dead crew members: " + (crew.size() - aliveCounter()) + " of " + crew.size());
    System.out.println("Pirates alive: " + aliveCounter() + " of " + crew.size());
    System.out.println();
  }

  public void fillShip() {
    for (int i = 1; i < (r.nextInt(5) + 5); i++) {
      //Fill the ship with pirates between 5 and 9, captain already added by the constructor as a first member
      Pirate pirate = new Pirate("pirate" + i);
      this.crew.add(pirate);
    }
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
      System.out.println("********************************");
      System.out.println("Score is equal, no one has won!!!");
      System.out.println("********************************");
    }
  }

  private void winCondition(Ship ship) {
    System.out.println("******** SHIP VICTORY! ********");
    System.out.println("Great job captain, " + ship.captain.pirate + "!");
    System.out.println("The ship has won!");
    System.out.println("Enjoy the party!");
    int roundsOfDrinks = r.nextInt(6) + 2;
    for (int i = 1; i < roundsOfDrinks+1; i++) {
      for (int j = 0; j < ship.crew.size(); j++) {
        if (ship.crew.get(j).isAlive) {
          ship.crew.get(j).drinkSomeRum();
        }
      }
    }
    System.out.println("They had " + roundsOfDrinks + " rounds of rum!");
    System.out.println("********************************");
    System.out.println();
  }

  private void looseCondition(Ship ship) {
    if (ship.aliveCounter() > 0) {
      int losses = r.nextInt(ship.aliveCounter());
      for (int i = 0; i < losses; i++) {
        //Kill random number of pirates (from 0 to alive members)
        if (ship.crew.get(i).isAlive) {
          ship.crew.get(i).isAlive = false;
          ship.crew.get(i).passedOut = false;
        }
      }
    }
    ship.isDestroyed = true;
  }

}
