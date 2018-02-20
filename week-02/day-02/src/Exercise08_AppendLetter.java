import java.util.*;

public class Exercise08_AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static List appendA(List<String> oldList) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < oldList.size(); i++) {
            List<Character> newChar = Arrays.asList('a');
            newList.add(oldList.get(i) + newChar.get(0));
        }
        return newList;
    }
}

// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"