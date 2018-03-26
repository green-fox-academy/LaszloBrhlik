public class Exercise_05 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!
    String example = "AaBbCcDd";

    example.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> c.isUpperCase(c))
            .forEach(System.out::println);
  }
}
