package thegardenapplication;

public class Plant {

  public String name;
  public String color;
  public double waterAbsorbed;
  public boolean needWater;

  public Plant(String color) {
    this.color = color;
    this.waterAbsorbed = 0;
    this.needWater = true;
  }

  public void watering(double amount) {
    this.waterAbsorbed += amount;
  }
}
