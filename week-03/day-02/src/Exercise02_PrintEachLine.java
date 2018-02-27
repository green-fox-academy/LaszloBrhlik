import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Exercise02_PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    Path path = Paths.get("my-file.txt");
    File file = new File("my-file.txt"); //variable never used
    try {
      Files.readAllLines(path);
      for (String line : Files.readAllLines(path)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
