import java.util.HashMap;

public class HomeWork_Tree {
  public static void main(String[] args) {
    /*Create 5 trees
    Store the data of them in variables in your program
    for every tree the program should store its'
    type
    leaf color
    age
    sex <- I have no idea what this means, BL note
    you can use just variables, or lists and/or maps*/

    HashMap<String, String> treeData1 = new HashMap<>();
    treeData1.put("type", "Pin Cherry");
    treeData1.put("leaf color", "Green");
    treeData1.put("age", "20");
    treeData1.put("sex", "sex1");

    HashMap<String, String> treeData2 = new HashMap<>();
    treeData2.put("type", "Cucumber Tree");
    treeData2.put("leaf color", "Green");
    treeData2.put("age", "30");
    treeData2.put("sex", "sex2");

    HashMap<String, String> treeData3 = new HashMap<>();
    treeData3.put("type", "Yellow Birch");
    treeData3.put("leaf color", "Yellow");
    treeData3.put("age", "40");
    treeData3.put("sex", "sex3");

    HashMap<String, String> treeData4 = new HashMap<>();
    treeData4.put("type", "Red Maple");
    treeData4.put("leaf color", "red");
    treeData4.put("age", "50");
    treeData4.put("sex", "sex4");

    HashMap<String, String> treeData5 = new HashMap<>();
    treeData5.put("type", "Tulip Tree");
    treeData5.put("leaf color", "Magenta");
    treeData5.put("age", "10");
    treeData5.put("sex", "sex5");

    System.out.println(treeData1);
    System.out.println(treeData2);
    System.out.println(treeData3);
    System.out.println(treeData4);
    System.out.println(treeData5);

    }

}
