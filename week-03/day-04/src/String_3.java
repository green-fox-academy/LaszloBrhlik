public class String_3 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".

    System.out.println(stringChanger("Halleluxah!"));

  }
  private static String stringChanger(String input) {
    String output = "";
    if (input.length() == 1) {
      return input.substring(input.length()-1);
    } else {
      output = input.charAt(0) + "*"+ stringChanger(input.substring(1));
    }
    return output;
  }
}
