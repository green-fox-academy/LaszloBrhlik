package charsequence;

public class Gnirts implements CharSequence {

  String someString;

  public Gnirts(String someString) {
    this.someString = someString;
  }

  @Override
  public int length() {
    return someString.length();
  }

  @Override
  public char charAt(int index) {
    return someString.charAt((length()-1) -index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String someStringBackwards = "";
    for (int i = start; i < end; i++) {
      someStringBackwards += someString.toCharArray()[someString.toCharArray().length-1 -i];
    }
    return someStringBackwards;
  }

  public static void main(String[] args) {

    Gnirts g = new Gnirts("whatisthis");

    System.out.println(g.length());
    System.out.println(g.charAt(0));
    System.out.println(g.subSequence(0,10));
  }
}
