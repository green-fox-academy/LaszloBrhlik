package thegardenapplication;

public class GardenApp {
  public static void main(String[] args) {

    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");

    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");

    Garden garden = new Garden();

    garden.addPlants(flower1);
    garden.addPlants(flower2);
    garden.addPlants(tree1);
    garden.addPlants(tree2);

    garden.checkThirst();
    garden.wateringGarden(40);
    garden.checkThirst();
    garden.wateringGarden(70);
    garden.checkThirst();

  }

}
