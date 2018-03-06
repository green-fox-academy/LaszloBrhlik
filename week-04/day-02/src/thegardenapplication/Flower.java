package thegardenapplication;

public class Flower extends Plant {

  public Flower(String color) {
    super(color);
    super.name = "Flower";
  }

  @Override
  public void watering(double amount) {
    this.waterAbsorbed += 0.75 * amount;
    if (waterAbsorbed > 5) {
      this.needWater = false;
    }
  }

}
