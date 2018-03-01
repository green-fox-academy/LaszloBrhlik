public class Bunnies {
  public static void main (String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    System.out.println(bunnies(55));
  }
  public static int bunnies(int number) {
    int ears = 2;
    if (number == 1) {
      return ears;
    } else {
      return ears+bunnies(number-1);
    }
  }
}
