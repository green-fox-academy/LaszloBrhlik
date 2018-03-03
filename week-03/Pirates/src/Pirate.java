import java.util.Random;

public class Pirate {

  String pirateName; //Pirates objects are not made yet
  boolean isAlive = true;
  boolean passedOut = false;
  int drinkCounter = 0;

  public Pirate(String pirateName) {
    this.pirateName = pirateName;
  }

  public void drinkSomeRum() {
    if (isAlive) {
      this.drinkCounter++;
    } else {
      System.out.println("he's dead");
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

  public void brawl(Pirate pirateName) {
    if (this.isAlive == true && pirateName.isAlive == true) {
      Random r = new Random();
      int randomWinnerNumber = r.nextInt(3);
      if (randomWinnerNumber == 0) {
        this.die();
      } else if (randomWinnerNumber == 1) {
        pirateName.die();
      } else {
        this.die();
        pirateName.die();
      }
    } else {
      System.out.println("One or both of the pirates are dead :( ");
    }
  }

}
