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

  String thisIsLong1 =

          "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!" +
                  "This is a very very very long String with spaces and some UPPERCASES!";

  String thisIsLong2 =

          "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!" +
                  "Is a very very VERY lothng String with spaces andis some CASE Supper!";

  @Before
  public void setUp() {

    anagramArraysSortObject = new AnagramArraysSort();
  }

  @Test
  public void isAnagramTest() {
    assertTrue(anagramArraysSortObject.isAnagram(readFileToString1, readFileToString2));
  }
}
