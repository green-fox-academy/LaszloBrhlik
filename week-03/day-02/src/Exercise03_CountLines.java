import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Exercise03_CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    String fileName = "src/my-file.txt";
    Path path = Paths.get(fileName);
    File file = new File(fileName); //not used here
    int counter = 0;

    try {
      for (String line : Files.readAllLines(path)) {
        counter++;
      }
    } catch (IOException e) {
      System.out.println("exc");
    }
    System.out.println(counter);
  }
}