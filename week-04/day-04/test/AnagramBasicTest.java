import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class AnagramBasicTest {

  AnagramBasic anagramBasicObject;

  String readFileToString1;

  {
    try {
      readFileToString1 = Files.readAllLines(Paths.get("test/file1.txt")).toString();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  String readFileToString2;

  {
    try {
      readFileToString2 = Files.readAllLines(Paths.get("test/file2.txt")).toString();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Before
  public void setUp() {

    anagramBasicObject = new AnagramBasic();

  }

  @Test
  public void isAnagram2000LinesTest() {
    assertTrue(anagramBasicObject.isAnagram(readFileToString1, readFileToString2));
  }

  @Test
  public void isAnagram2000LinesTes() {
    assertTrue(anagramBasicObject.isAnagram("aaa ccc", "Cc caaa"));
  }
}
