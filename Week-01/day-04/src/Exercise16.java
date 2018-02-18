import java.util.Scanner;

public class Exercise16 {

        public static void main(String[] args) {
            // Write a program that asks for two integers
            // The first represents the number of chickens the farmer has
            // The second represents the number of pigs owned by the farmer
            // It should print how many legs all the animals have

            Scanner scanner = new Scanner(System.in);
            System.out.println("Add please the number of chickens:");

            int chickenNr = scanner.nextInt();
            System.out.println("Add please the number of pigs:");

            int pigNr = scanner.nextInt();
            int totalLegs = chickenNr * 2 + pigNr * 4;
            System.out.println("Total legs are: " + totalLegs);
        }

}

