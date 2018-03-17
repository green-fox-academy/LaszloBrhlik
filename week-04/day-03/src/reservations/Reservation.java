package reservations;

import java.util.Random;

public class Reservation implements Booking {

  private String dowBooking;
  private String codeBooking;

  private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private String digits = "0123456789";
  private String[] dowBase = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private String codeBase = upper + digits;
  private Random r = new Random();
  private int codeLength = 8;

  public Reservation() {
    this.dowBooking = dowBookingGenerator();
    this.codeBooking = codeBookingGenerator();
  }

  @Override
  public String getDowBooking() {
    return dowBooking;
  }

  @Override
  public String getCodeBooking() {
    return codeBooking;
  }

  public String dowBookingGenerator() {
    int index = r.nextInt(this.dowBase.length);
    String temp = this.dowBase[index];
    return temp;
  }

  public String codeBookingGenerator() {
    String temp = "";
    while (temp.length() < this.codeLength) {
      int index = r.nextInt(codeBase.length());
      temp += codeBase.charAt(index);
    }
    return temp;
  }
}
