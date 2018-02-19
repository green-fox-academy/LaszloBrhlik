import java.util.Scanner;

public class Exercise04_Sum {

    public static void main(String[] args) {
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you wish to sum?");
        int totalNumbers = scanner.nextInt();
        int numArray[] = new int[totalNumbers];

        System.out.println("Please type the numbers: ");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
            System.out.println("The " + (i+1) + ". number is: " + numArray[i]);
        }

        sum(numArray);

    }
    public static void sum(int[] added) {
        int sum = 0;
        for (int i : added) {
            sum += i;
        }
        System.out.println("----------------------------------");
        System.out.println("The sum of the numbers is = " + sum);
    }
}
