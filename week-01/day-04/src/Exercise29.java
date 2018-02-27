import java.util.Scanner;

public class Exercise29 {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //    *
        //   ***
        //  *****
        // *******
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a number");
        int number = scanner.nextInt();

        for (int i = (number+1), j = 0; i > 0 && j < (number+1); i--, j++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            for (int k = 1; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
