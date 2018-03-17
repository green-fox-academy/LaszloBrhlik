package flyable;

public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name, int age, String speed) {
    super(name, age, speed);
  }

  @Override
  public void land() {
    System.out.println("Helicopter's landing interface");
  }

  @Override
  public void fly() {
    System.out.println("Helicopter'a flying interface");
  }
}
