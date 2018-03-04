public class WarApp {
  public static void main(String[] args) {

    //Unfortunately I don't have time right now to refactor 'main', sorry for the code duplication

    //Creating armadaA
    Pirate captainA1 = new Pirate("Black Beard 1");
    Pirate captainA2 = new Pirate("Black Beard 2");
    Pirate captainA3 = new Pirate("Black Beard 3");
    Pirate captainA4 = new Pirate("Black Beard 4");

    Ship shipA1 = new Ship(captainA1);
    Ship shipA2 = new Ship(captainA2);
    Ship shipA3 = new Ship(captainA3);
    Ship shipA4 = new Ship(captainA4);

    shipA1.fillShip();
    shipA2.fillShip();
    shipA3.fillShip();
    shipA4.fillShip();

    Armada armadaA = new Armada();
    armadaA.addShip(shipA1);
    armadaA.addShip(shipA2);
    armadaA.addShip(shipA3);
    armadaA.addShip(shipA4);

    //Creating armadaB
    Pirate captainB1 = new Pirate("Jack Sparrow 1");
    Pirate captainB2 = new Pirate("Jack Sparrow 2");
    Pirate captainB3 = new Pirate("Jack Sparrow 3");
    Pirate captainB4 = new Pirate("Jack Sparrow 4");

    Ship shipB1 = new Ship(captainB1);
    Ship shipB2 = new Ship(captainB2);
    Ship shipB3 = new Ship(captainB3);
    Ship shipB4 = new Ship(captainB4);

    shipB1.fillShip();
    shipB2.fillShip();
    shipB3.fillShip();
    shipB4.fillShip();

    Armada armadaB = new Armada();
    armadaB.addShip(shipB1);
    armadaB.addShip(shipB2);
    armadaB.addShip(shipB3);
    armadaB.addShip(shipB4);

    //Let's have a war!
    armadaA.war(armadaB);
  }
}
