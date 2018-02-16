import java.util.Scanner;

public class Exercise29 {

    public static void main(String[] args) {



// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please add a number");

        int number = scanner.nextInt();

        for (int i = (number+1), k = 0; i > 0 && k < (number+1); i--, k++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
