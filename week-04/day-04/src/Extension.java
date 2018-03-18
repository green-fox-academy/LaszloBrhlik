import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

  private char[] base = {'a', 'A', 'u', 'U', 'o', 'O', 'e', 'E', 'i', 'I'};
  private List list = Arrays.asList(base);

  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    int maxValue = 0;
    if (a >= b && a >= c) {
      maxValue = a;
    } else if (b >= a && b >= c) {
      maxValue = b;
    } else if (c >= a && c >= b) {
      maxValue = c;
    }
    return maxValue;
  }

  double median(List<Integer> pool) {
    double median;
    Collections.sort(pool);
    if (pool.size() % 2 == 0) {
      median = (pool.get(pool.size() / 2) + pool.get(pool.size() / 2 - 1)) / 2;
    } else {
      median = pool.get((pool.size() - 1) / 2);
    }
    return median;
  }

  boolean isVowel(char c) {
    return list.contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    if (length == 1) {
      if (isVowel(teve.charAt(0))) {
        teve = teve.charAt(0) + "v" + teve.charAt(0);
      }
    } else {
      for (int i = 0; i < length; i++) {
        char c = teve.charAt(i);
        if (isVowel(c)) {
          teve = String.join(c + "v" + c, teve.split(""+c));
          i += 2;
          length += 2;
        }
      }
    }
    return teve;
  }
}
