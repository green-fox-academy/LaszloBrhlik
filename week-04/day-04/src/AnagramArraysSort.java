import java.util.Arrays;

public class AnagramArraysSort {

  public boolean isAnagram(String anagram1, String anagram2) {
    //For checking running times
    //O(n log n) worst case, in theory at least

    char[] anagram1CharArray = anagram1.replaceAll("[\\s]", "").toLowerCase().toCharArray();
    char[] anagram2CharArray = anagram2.replaceAll("[\\s]", "").toLowerCase().toCharArray();

    if (anagram1CharArray.length != anagram2CharArray.length) {
      return false;
    }

    Arrays.sort(anagram1CharArray);
    Arrays.sort(anagram2CharArray);

    return Arrays.equals(
            anagram1CharArray,
            anagram2CharArray
    );
  }

/*  //And it should work fine
  public static void main(String[] args) {
    AnagramArraysSort anagramcheck = new AnagramArraysSort();
    System.out.println(anagramcheck.isAnagram("te st er", "erttes"));
  }*/
}

