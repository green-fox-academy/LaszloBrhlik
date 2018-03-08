import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class AnagramArraysSortTest {

  AnagramArraysSort anagramArraysSortObject;

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

  String oneLineString1 =

          "This is a very very very long String with spaces and some UPPERCASES!";

  String oneLineString2 =

          "Is a very very VERY lothng String with spaces andis some CASE Supper!";

  String emptyString1 = "";

  String emptyString2 = "";

  String nullString1 = null;

  @Before
  public void setUp() {
    anagramArraysSortObject = new AnagramArraysSort();
  }

  @Test
  public void isAnagram2000LinesTest() {
    assertTrue(anagramArraysSortObject.isAnagram(readFileToString1, readFileToString2));
  }

  @Test
  public void isAnagramOneLineTest() {
    assertTrue(anagramArraysSortObject.isAnagram(oneLineString1, oneLineString2));
  }

  @Test
  public void isAnagramEmptyStringTest() {
    assertTrue(anagramArraysSortObject.isAnagram(emptyString1, emptyString2));
  }

  @Test
  public void isAnagramFalseTest() {
    assertFalse(anagramArraysSortObject.isAnagram("this should", "be false"));
  }

  @Test(expected = NullPointerException.class)
  public void isAnagramNullStringTest() {
    assertTrue(anagramArraysSortObject.isAnagram(nullString1, emptyString2));
  }
}
