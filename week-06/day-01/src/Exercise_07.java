import java.util.stream.Collectors;

public class Exercise_07 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of characters in a given string!
    String example ="Check the frequency of the characters of this string";
    System.out.println(example.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
  }
}
