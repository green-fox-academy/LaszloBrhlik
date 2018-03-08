public class MagicWithNumbers {

  int returnedNumber;

  public MagicWithNumbers() {
  }

  public int Sum(int[] addArrayList) {
    try {
      for (Integer number : addArrayList) {
        returnedNumber += number;
      }
      return returnedNumber;
    } catch (NullPointerException e) {
      return 0;
    }
  }
}
