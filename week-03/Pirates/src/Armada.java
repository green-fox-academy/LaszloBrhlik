import java.util.ArrayList;
import java.util.List;

public class Armada {

  List<Ship> armada;
  //Armada objects are initialized in 'main' and also ships are added separately in 'main'

  public Armada() {
    this.armada = new ArrayList<>();
  }

  public void addShip(Ship ship) {
    this.armada.add(ship);
  }

  public void war(Armada otherArmada) {
    for (int i = 0; i < this.armada.size(); i++) {
      for (int j = 0; j < otherArmada.armada.size(); j++) {
        if (this.armada.get(this.armada.size() - 1).isDestroyed) {
          System.out.println();
          System.out.println("******ARMADA VICTORY******");
          System.out.println("The second armada has won!");
          System.out.println("**************************");
          System.out.println();
        } else if (otherArmada.armada.get(otherArmada.armada.size() - 1).isDestroyed) {
          System.out.println();
          System.out.println("******ARMADA VICTORY******");
          System.out.println("The first armada has won!");
          System.out.println("**************************");
          System.out.println();
        } else if (!this.armada.get(i).isDestroyed && !otherArmada.armada.get(j).isDestroyed) {
          this.armada.get(i).battle(otherArmada.armada.get(j));
          if (this.armada.get(i).isDestroyed) {
            i++;
          } else if (otherArmada.armada.get(j).isDestroyed) {
            j++;
          } else {
            this.war(otherArmada); //Recursion until a ship is destroyed
          }
        }
      }
    }

  }


}
