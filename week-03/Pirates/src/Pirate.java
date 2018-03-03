import java.util.Random;

public class Pirate {

  String pirate; //Pirates objects are not made yet
  boolean isAlive = true;
  boolean passedOut = false;
  int drinkCounter = 0;

  public Pirate(String pirateName) {
    this.pirate = pirateName;
  }

  public void drinkSomeRum() {
    if (isAlive) {
      this.drinkCounter++;
    } else {
      System.out.println("this pirate is dead");
    }
  }

  public void howIsItGoingMate() {
    if (0 <= this.drinkCounter && this.drinkCounter < 5) {
      System.out.println("Pour me anudder!");
    } else {
      passedOut = true;
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin? - and he passes out...");
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
        this.die();
        otherPirate.die();
      }
    } else {
      System.out.println("One or both of the pirates are dead :( ");
    }
  }

}
