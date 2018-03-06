package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<Aircraft> aircrafts;
  private double storedAmmo;
  private double healthPoint;
  private double allDamage;

  public Carrier(double storedAmmo, double healthPoint) {
    this.storedAmmo = storedAmmo;
    this.healthPoint = healthPoint;
    this.aircrafts = new ArrayList<>();
  }

  public void addAircraft(String type) {
    if (type == "F16") {
      aircrafts.add(new F16());
    } else if (type == "F35") {
      aircrafts.add(new F35());
    }
  }

  public void fillAircrafts() {
    for (Aircraft aircraft : aircrafts) {
      if (aircraft.getType() == "F35") {
        aircraft.reFill(storedAmmo);
      }
    }
    for (Aircraft aircraft : aircrafts) {
      if (aircraft.getType() == "F16") {
        aircraft.reFill(storedAmmo);
      }
    }
  }


  public void fight(Carrier carrier) {
    for (Aircraft aircraft : this.aircrafts) {
      aircraft.fight();
      carrier.healthPoint -= aircraft.allDamage;
      this.allDamage += aircraft.allDamage;
    }
  }

  public void getStatus() {
    if (this.healthPoint <= 0) {
      System.out.println();
      System.out.println("It's dead Jim :(");
      System.out.println();
    } else {
      System.out.println();
      System.out.println("HP: " + healthPoint + ", Aircraft count: " + this.aircrafts.size() + ", Ammo Storage: " +
              this.storedAmmo + ", Total damage: " + this.allDamage);
      System.out.println("Aircrafts:");
      for (Aircraft aircraft : this.aircrafts)
        System.out.println("Type " + aircraft.getType() + ", Ammo: " + aircraft.storedAmmo + ", Base Damage: " +
                aircraft.baseDamage + ", All Damage: " + aircraft.allDamage);
    }
  }
}
