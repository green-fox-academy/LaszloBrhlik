import java.util.HashMap;
import java.util.Map;

public class AnagramHashMap {

  public boolean isAnagram(String anagram1, String anagram2) {
    //For checking running times
    //O(n) worst case, in theory at least instead of O(n log n) sorting methods

    char[] anagram1CharArray = anagram1.replaceAll("[\\s]", "").toLowerCase().toCharArray();
    char[] anagram2CharArray = anagram2.replaceAll("[\\s]", "").toLowerCase().toCharArray();

    Map<Character, Integer> myHashMap = new HashMap<>();

    for (char c : anagram1CharArray) {
      int counter = 1;
      if (myHashMap.containsKey(c)) {
        counter = myHashMap.get(c) + 1;
      }
      myHashMap.put(c, counter);
    }

    for (char c : anagram2CharArray) {
      int counter = 1;
      if (myHashMap.containsKey(c)) {
        counter = myHashMap.get(c) - 1;
      }
      myHashMap.put(c, counter);
    }

    for (char key : myHashMap.keySet()) {
      if (myHashMap.get(key) != 0) {
        return false;
      }
    }

    return true;
  }

/*  //And it should work fine
  public static void main(String[] args) {
    AnagramHashMap anagramcheck = new AnagramHashMap();
    System.out.println(anagramcheck.isAnagram("test er", "erttes"));
  }*/
}
