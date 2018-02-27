import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise05_WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.

    writeMultipleLines("src/my-file.txt", "apple", 5);


  }
  public static void writeMultipleLines(String path, String word, int number) {
    List<String> wordIn = new ArrayList<>(Arrays.asList(word));
    try {
      Files.write(Paths.get(path), wordIn);
      for (int i = 0; i < number-1; i++) {
        Files.write(Paths.get(path), wordIn, StandardOpenOption.APPEND);
      }
    }catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }

  }
}

