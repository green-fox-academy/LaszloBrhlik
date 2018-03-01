public class String_2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.

    System.out.println(stringChanger("Halleluxah!"));

  }
  private static String stringChanger(String input) {
    String output = "";
    if (input.length() == 0) {
      return "";
    } else if (input.charAt(0) == 'x') {
      output = stringChanger(input.substring(1));
    } else {
      output = input.charAt(0) + stringChanger(input.substring(1));
    }
    return output;
  }
}
