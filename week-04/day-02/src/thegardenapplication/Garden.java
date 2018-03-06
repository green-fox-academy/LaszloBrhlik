package thegardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> garden;
  private int thirstyInGarden = 0;

  public Garden(String name) {
    this.garden = new ArrayList<>();
  }

  public void countThirst() {
    for (Plant plants : garden) {
      if (plants.needWater) {
        thirstyInGarden++;
      }
    }
  }

  public void wateringGarden(int amount) {
    countThirst();
    for (Plant plant : garden) {
      if (plant.needWater) {
        plant.watering(amount / thirstyInGarden);
      }
    }
  }

  public void checkGarden() {
    for (Plant plant : garden) {
      if (plant.needWater) {
        System.out.println("The " + plant.color + " " + plant.name + " needs water");
      } else {
        System.out.println("The " + plant.color + " " + plant.name + " doesn't need water");
      }
    }
  }

}
