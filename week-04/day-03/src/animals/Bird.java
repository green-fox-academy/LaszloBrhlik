package animals;

public class Bird extends Animal {

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
}
