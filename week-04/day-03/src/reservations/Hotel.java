package reservations;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
  public static void main(String[] args) {

    List<Reservation> reservedList= new ArrayList<>();

    Reservation res1 = new Reservation();
    Reservation res2 = new Reservation();
    Reservation res3 = new Reservation();
    Reservation res4 = new Reservation();
    Reservation res5 = new Reservation();

    reservedList.add(res1);
    reservedList.add(res2);
    reservedList.add(res3);
    reservedList.add(res4);
    reservedList.add(res5);

    for (Reservation reserved : reservedList) {
      System.out.printf("Booking# %s for %s%n", reserved.getCodeBooking(), reserved.getDowBooking());
    }
  }
}
