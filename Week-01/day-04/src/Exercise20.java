import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Number1 is bigger than number2!");
        } else {
            System.out.println("Number2 is bigger than number1!");
        }
    }

}
