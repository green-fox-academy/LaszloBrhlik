import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise04_WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

    String fileName = "src/my-file.txt";
    Path path = Paths.get(fileName);
    List<String> myName = new ArrayList<>(Arrays.asList("Laszlo Brhlik"));

    try {
      Files.write(path, myName);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
