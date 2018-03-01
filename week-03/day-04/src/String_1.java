public class String_1 {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    System.out.println(stringChanger("Halleluxah!"));

  }
  private static String stringChanger(String input) {
    String output = "";
    if (output.length() == input.length()) {
      return "";
    } else if (input.charAt(0) == 'x') {
      output = 'y' + stringChanger(input.substring(1));
    } else {
      output = input.charAt(0) + stringChanger(input.substring(1));
    }
    return output;
  }
}
