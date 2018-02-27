import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise06_CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    System.out.println(copyFile("src/my-file.txt", "src/my-file2.txt"));

  }
  public static boolean copyFile(String fileName1, String fileName2) {
    try {
      Files.copy(Paths.get(fileName1), Paths.get(fileName2));
      return true;
      } catch (IOException e) {
      System.out.println("Unable to open/write files");
    }
    return false;
  }
}