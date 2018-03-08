public class MagicWithNumbers {

  int returnedNumber;

  public MagicWithNumbers() {
  }

  public int Sum(int[] addArrayList) {
    for (Integer number : addArrayList) {
      returnedNumber += number;
    }
    return returnedNumber;
  }
}
