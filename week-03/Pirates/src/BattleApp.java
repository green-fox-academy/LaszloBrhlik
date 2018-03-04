public class BattleApp {
  public static void main(String[] args) {

    Pirate captain1 = new Pirate("Black Beard");
    Ship ship1 = new Ship(captain1);

    Pirate captain2 = new Pirate("Jack Sparrow");
    Ship ship2 = new Ship(captain2);

    ship1.fillShip();
    ship2.fillShip();

    ship1.battle(ship2);

  }
}
