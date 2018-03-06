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
    double filledAmmo;
    if (storedAmmo == maxAmmo) {
      return fill;
    } else if (fill > maxAmmo - storedAmmo) {
      filledAmmo = maxAmmo - storedAmmo;
      storedAmmo += filledAmmo;
      return fill - storedAmmo;
    } else {
      storedAmmo += fill;
      return storedAmmo;
    }
  }

  public String getType() {
    return this.type;
  }

  public void getStatus() {
    System.out.println("Type: " + type + ", Ammo: " + storedAmmo + ", Base Damage: " + baseDamage +
            ", All Damage: " + allDamage);
  }
}
