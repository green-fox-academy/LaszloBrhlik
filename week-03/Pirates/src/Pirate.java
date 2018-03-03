public class Pirate {

  String pirateName;
  int drinkCounter = 0;

  public Pirate(String pirateName) {
    this.pirateName = pirateName;
  }

  public int drinkSomeRum() {
    this.drinkCounter++;
    return drinkCounter;
  }

  public void howIsItGoingMate() {
    if (0 <= this.drinkCounter && this.drinkCounter < 5) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }

  }

}
