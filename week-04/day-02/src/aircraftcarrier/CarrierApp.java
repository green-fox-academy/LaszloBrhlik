package aircraftcarrier;

public class CarrierApp {
  public static void main(String[] args) {

    //Still testing...

    Carrier carrier1 = new Carrier(100, 5000);
    carrier1.addAircraft("F35");
    carrier1.addAircraft("F35");
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F16");
    carrier1.fillAircrafts();

    Carrier carrier2 = new Carrier(100, 5000);
    carrier2.addAircraft("F35");
    carrier2.addAircraft("F35");
    carrier2.addAircraft("F16");
    carrier2.addAircraft("F16");
    carrier2.fillAircrafts();

    carrier1.fight(carrier2);

    carrier1.getStatus();
    carrier2.getStatus();
  }
}
