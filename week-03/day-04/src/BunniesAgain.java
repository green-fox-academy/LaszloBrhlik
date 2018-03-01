public class BunniesAgain {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    System.out.println(bunniesAgain(4));

  }
  public static int bunniesAgain(int number) {
    int ears = 0;
    if (number == 1) {
      return 2;
    } else if (number % 2 != 0) {
      ears += 2;
    } else if (number % 2 == 0) {
      ears += 3;
    }
    return ears + bunniesAgain(number-1);
  }
}

