public class SumDigit {
  public static void main (String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    System.out.println(sumDigit(155));

  }
  public static int sumDigit(int n) {
    int result = 0;
    if (n == 0) {
      return 0;
    } else {
      result = n%10 + sumDigit(n/10);
    }
    return result;
  }
}


