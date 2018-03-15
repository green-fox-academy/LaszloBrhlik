import java.util.ArrayList;
import java.util.List;

public class Exercise20_Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    System.out.print(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`


  }

  public static List<Integer> unique(int[] input) {
    //Insertion Sort
    for (int i = 0; i < input.length; i++) {
      int key = input[i];
      int j = i - 1;
      while (j >= 0 && input[j] > key) {
        input[j + 1] = input[j];
        j = j - 1;
      }
      input[j + 1] = key;
    }

    //Remove duplicates
    List<Integer> output = new ArrayList<>();
    for (int i = 0; i < input.length - 1; i++) {
      if (input[i] != input[i + 1]) {
        output.add(input[i]);
      }
    }
    //and also add last element
    output.add(input[input.length - 1]);
    return output;
  }
}
