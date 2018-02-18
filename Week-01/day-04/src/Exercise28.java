import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        // *
        // **
        // ***
        // ****
        // The triangle should have as many lines as the number was
        //Note: use System.out.print() instead of System.out.println()

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a number");
        int number = scanner.nextInt();

        for (int k = 0; k < (number+1); k++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}