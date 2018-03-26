import java.util.stream.Collectors;

public class Exercise_09 {
  public static void main(String[] args) {
    //Write a Stream Expression to convert a char array to a string!

    char[] charArray = new char[]{'A', 'a', 'B', 'b', 'C', 'c'};

    String charStream = new String(charArray).chars()
            .mapToObj(i -> (char) i)
            .map(Object::toString)
            .collect(Collectors.joining(""));
    System.out.println(charStream);
  }
}
