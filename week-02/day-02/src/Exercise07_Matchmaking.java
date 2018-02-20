import java.util.*;

    public class Exercise07_Matchmaking{
        public static void main(String... args) {
            ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
            ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

            // Write a method that joins the two lists by matching one girl with one boy into a new list
            // Expected output: "Eve", "Joe", "Ashley", "Fred"...

            System.out.println(makingMatches(girls, boys));
        }

        public static List makingMatches(List<String> g, List<String> b) {
            List<String> gb = new ArrayList<>();
            for (int i = 0, j = 0; i < g.size() && j < b.size(); i++, j++) {
                gb.add(g.get(i));
                gb.add(b.get(j));
            }
            return gb;
            //right now just a for loop of i would be enough...
        }
    }
