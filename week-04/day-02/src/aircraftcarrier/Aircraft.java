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

  public void fight() {
    allDamage = storedAmmo * baseDamage;
    storedAmmo = 0;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type: " + type + ", Ammo: " + storedAmmo + ", Base Damage: " + baseDamage +
            ", All Damage: " + allDamage;
  }
}
