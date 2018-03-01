public class Refactorio {
  public static void main(String[] args) {
    // Create a recursive function called `refactorio`
    // that returns it's input's factorial

    System.out.println("The factorials of the first 5 numbers are:");
    System.out.println("------------------------------------------");
    for (int i = 1; i < 6; i++) {
      System.out.println("The factorial of "+i+" is: "+refactorio(i));
    }

  }
  public static int refactorio(int n) {
    if (n==1) {
      return 1;
    } else {
      return n * refactorio(n-1);
    }
  }
}
