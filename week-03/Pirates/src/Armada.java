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
    System.out.println("#################################");
    System.out.println("####### THE WAR HAS BEGUN #######");
    System.out.println("#################################");
    System.out.println();
    for (int i = 0; i < this.armada.size(); i++) {
      for (int j = 0; j < otherArmada.armada.size(); j++) {
        if (!this.armada.get(i).isDestroyed && !otherArmada.armada.get(j).isDestroyed) {
          this.armada.get(i).battle(otherArmada.armada.get(j));

          if (this.armada.get(i).isDestroyed && otherArmada.armada.get(j).isDestroyed) {
            System.out.println();
            System.out.println("*************** TIE **************");
            System.out.println("* There are no winners in a war! *");
            System.out.println("*********************************");
            System.out.println();

          } else if (this.armada.get(i).isDestroyed) {
            if (i == this.armada.size() - 1) {
              System.out.println();
              System.out.println("******** ARMADA VICTORY ********");
              System.out.println("** The second armada has won! **");
              System.out.println("********************************");
              System.out.println();
              break;
            } else {
              System.out.println("################################");
              System.out.println("### FIRST ARMADA'S NEXT SHIP ###");
              System.out.println("################################");
              System.out.println();
            }

          } else if (otherArmada.armada.get(j).isDestroyed) {
            if (j == otherArmada.armada.size() - 1) {
              System.out.println();
              System.out.println("******* ARMADA VICTORY ********");
              System.out.println("** The first armada has won! **");
              System.out.println("*******************************");
              System.out.println();
              break;
            } else {
              System.out.println("#################################");
              System.out.println("### SECOND ARMADA'S NEXT SHIP ###");
              System.out.println("#################################");
              System.out.println();
            }
          /*} else {
            j--;
            //In case of a tie - repeat battle
            System.out.println("##################################");
            System.out.println("###### THE BATTLE CONTINUES ######");
            System.out.println("##################################");
            System.out.println();*/
            //The code above can cause an infinite loop, when all the dueling pairs of the pirates are dead
            //and the score is equal...so in case of a tie, next ships are coming, both are defeated...
          } else {
            this.armada.get(i).isDestroyed = true;
            otherArmada.armada.get(j).isDestroyed = true;
            System.out.println("#################################");
            System.out.println("## PREPARE FOR THE NEXT BATTLE ##");
            System.out.println("#################################");
            System.out.println();
          }
        }
      }
    }
  }

}
