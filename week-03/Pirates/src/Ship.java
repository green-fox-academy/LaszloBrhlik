import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> crew;
  Pirate captain; //A captain object is not made yet

  public Ship() {
    this.crew = new ArrayList<>();
  }

  public void fillShip(Pirate pirate, Pirate captain) {
    Random r = new Random();
    for (int i = 0; i < (r.nextInt(100)+100); i++) {
      //fill the ship with a captain and with pirates between 100 and 199
      this.crew.add(pirate);
    }
    this.crew.add(captain);
  }

}
