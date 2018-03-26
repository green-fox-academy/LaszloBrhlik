import java.util.Arrays;

public class Exercise_05 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!
    String example = "AaBbCcDd";

    example.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> (char) c)
            .forEach(System.out::println);
  }
}
