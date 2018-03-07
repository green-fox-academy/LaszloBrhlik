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
    try {
      for (int i = 0; i < fill; i++) {
        if (this.maxAmmo > this.storedAmmo) {
          this.storedAmmo++;
          fill--;
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception Handled");
    }
    return fill;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type: " + type + ", Ammo: " + storedAmmo + ", Base Damage: " + baseDamage +
            ", All Damage: " + allDamage;
  }
}
