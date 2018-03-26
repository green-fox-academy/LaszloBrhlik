package Exercise_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {

  String name;
  String type;
  String color;

  public Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }

  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Red fox", "Vulpes vulpes", "Red"));
    foxes.add(new Fox("Arctic fox", "Vulpes lagopus", "Red"));
    foxes.add(new Fox("Corsac fox", "Vulpes corsac", "Green"));
    foxes.add(new Fox("Kit fox", "Vulpes macrotis", "Green"));
    foxes.add(new Fox("Pale fox", "Vulpes pallida", "Red"));

    List<String> greenFoxes = foxes.stream()
            .filter(f -> f.color.equalsIgnoreCase("green"))
            .map(f -> f.name)
            .collect(Collectors.toList());
    System.out.println(greenFoxes);

    List<String> moreFoxes = foxes.stream()
            .filter(f -> f.color.equalsIgnoreCase("green")
                    || f.type.equalsIgnoreCase("vulpes pallida"))
            .map(f -> f.name)
            .collect(Collectors.toList());
    System.out.println(moreFoxes);
  }
}
