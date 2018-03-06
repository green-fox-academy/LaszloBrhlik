package thegardenapplication;

public class Tree extends Plant {

  public Tree(String color) {
    super(color);
    super.name = "Tree";
  }

  @Override
  public void watering(double amount) {
    this.waterAbsorbed += 0.4 * amount;
    if (waterAbsorbed > 10) {
      this.needWater = false;
    }
  }
}
