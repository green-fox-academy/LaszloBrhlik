package aircraftcarrier;

public class Aircraft {

  public String type;
  public int maxAmmo;
  public int storedAmmo;
  public int baseDamage;
  public int allDamage;

  public Aircraft() {
    storedAmmo = 0;
  }

  public int fight() {
    allDamage = storedAmmo * baseDamage;
    storedAmmo = 0;
    return allDamage;
  }

  public double reFill(double fill) {
    while (storedAmmo < maxAmmo) {
      for (int i = 0; i < fill; i++) {
        storedAmmo++;
        fill--;
      }
    }
    return fill;
  }

  public String getType() {
    return this.type;
  }

  public void getStatus() {
    System.out.println("Type: " + type + ", Ammo: " + storedAmmo + ", Base Damage: " + baseDamage +
            ", All Damage: " + allDamage);
  }
}
