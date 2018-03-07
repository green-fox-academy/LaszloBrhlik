package charsequence;

public class Shifter implements CharSequence{

  String inputString;
  int shift;

  public Shifter(String inputString, int shift) {
    this.inputString = inputString;
    this.shift = shift;
  }

  @Override
  public int length() {
    return inputString.length();
  }

  @Override
  public char charAt(int index) {
    return inputString.toCharArray()[shift];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String shiftedString = "";
    for (int i = start; i < end; i++) {
      shiftedString += inputString.toCharArray()[i + shift];
    }
    return shiftedString;
  }

  public static void main(String[] args) {

    Shifter s = new Shifter("example", 2);

    System.out.println(s.length());
    System.out.println(s.charAt(0));
    System.out.println(s.subSequence(0,5));
  }
}
