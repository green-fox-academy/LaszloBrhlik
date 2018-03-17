package animals;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void land() {
    System.out.println("Bird's landing, Flyable interface");
  }

  @Override
  public void fly() {
    System.out.println("Bird's flying, Flyable interface");
  }
}
