public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    System.out.println(numberAdder(3));
  }
  public static int numberAdder(int n) {
    int result;
    if (n == 1) {
      return 1;
    } else {
      result = n + numberAdder(n-1);
    }
    return result;
  }
}
