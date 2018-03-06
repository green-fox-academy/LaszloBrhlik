package thegardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> garden;
  private int thirstyInGarden = 0;

  public Garden() {
    this.garden = new ArrayList<>();
  }

  public void addPlants(Plant plant) {
    this.garden.add(plant);
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
    thirstyInGarden = 0;
  }

  public void checkThirst() {
    for (Plant plant : garden) {
      if (plant.needWater) {
        System.out.println("The " + plant.color + " " + plant.name + " needs water");
      } else {
        System.out.println("The " + plant.color + " " + plant.name + " doesn't need water");
      }
    }
    System.out.println();
  }

}
