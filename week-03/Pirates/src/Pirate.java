import java.util.Random;

public class Pirate {

  String pirate;
  //Pirates objects will be made when creating a ship
  //Except the captain
  boolean isAlive = true;
  boolean passedOut = false;
  int drinkCounter = 0;

  public Pirate(String pirateName) {
    this.pirate = pirateName;
  }

  public void drinkSomeRum() {
    if (isAlive) {
      this.drinkCounter++;
    }
  }

  public void howIsItGoingMate() {
    if (this.isAlive) {
      if (0 <= this.drinkCounter && this.drinkCounter < 5 && !this.passedOut) {
        System.out.println(this.pirate + ": \"Pour me anudder\"!");
      } else if (this.passedOut) {
        System.out.println(this.pirate + ": is passed out!");
      } else {
        passedOut = true;
        System.out.println(this.pirate + ": \"Arghh, I'ma Pirate. How d'ya d'ink its goin?\" - and he passes out...");
      }
      System.out.println("-------------------------------");
    } else {
      System.out.println(this.pirate + ": is dead!");
      System.out.println("-------------------------------");
    }
  }

  public void die() {
    this.isAlive = false;
  }

  public void brawl(Pirate otherPirate) {
    if (this.isAlive == true && otherPirate.isAlive == true) {
      Random r = new Random();
      int randomWinnerNumber = r.nextInt(3);
      if (randomWinnerNumber == 0) {
        this.die();
      } else if (randomWinnerNumber == 1) {
        otherPirate.die();
      } else {
        this.passedOut = true;
        otherPirate.passedOut = true;
      }
    }

  }
}
