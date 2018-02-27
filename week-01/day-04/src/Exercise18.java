import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("This is an \"even\" number");
        } else {
            System.out.println("This is an \"odd\" number");
        }
    }

}
