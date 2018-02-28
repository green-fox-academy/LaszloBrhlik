public class Animal {
  /*Create an Animal class
  Every animal has a hunger value, which is a whole number
  Every animal has a thirst value, which is a whole number
  when creating a new animal object these values are created with the default 50 value
  Every animal can eat() which decreases their hunger by one
  Every animal can drink() which decreases their thirst by one
  Every animal can play() which increases both by one*/

  public int hunger;
  public int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    this.hunger -= 1;
  }

  public void drink() {
    this.thirst -= 1;
  }

  public void play() {
    this.hunger ++;
    this.thirst ++;
  }
}
