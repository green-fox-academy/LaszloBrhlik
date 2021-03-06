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

  String oneLineString1 =

          "This is a very very very long String with spaces and some UPPERCASES!";

  String oneLineString2 =

          "Is a very very VERY lothng String with spaces andis some CASE Supper!";

  String emptyString1 = "";

  String emptyString2 = "";

  String nullString1 = null;

  @Before
  public void setUp() {
    anagramBasicObject = new AnagramBasic();
  }

  @Test (timeout = 30000)
  public void isAnagram2000LinesTest() {
    assertTrue(anagramBasicObject.isAnagram
            (readFileToString1, readFileToString2));
  }

  @Test
  public void isAnagramOneLineTest() {
    assertTrue(anagramBasicObject.isAnagram
            (oneLineString1, oneLineString2));
  }

  @Test
  public void isAnagramEmptyStringTest() {
    assertTrue(anagramBasicObject.isAnagram
            (emptyString1, emptyString2));
  }

  @Test
  public void isAnagramFalseTest() {
    assertFalse(anagramBasicObject.isAnagram
            ("this should", "be false"));
  }

  @Test(expected = NullPointerException.class)
  public void isAnagramNullStringTest() {
    assertTrue(anagramBasicObject.isAnagram
            (nullString1, emptyString2));
  }
}
