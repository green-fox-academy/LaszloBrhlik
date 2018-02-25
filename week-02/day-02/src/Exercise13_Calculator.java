import java.util.Scanner;

public class Exercise13_Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    System.out.println("Please type in the expression:");
    Scanner scanner = new Scanner(System.in);
    String[] userInput = scanner.nextLine().split(" ");
    String operation = userInput[0];
    Integer operand1 = Integer.valueOf(userInput[1]);
    Integer operand2 = Integer.valueOf(userInput[2]);
    calculate(operation, operand1, operand2);
    //This will return integers, maybe you can use Double instead of Integer..

  }

  public static void calculate(String operation, int operand1, int operand2) {
    int result = 0;
    if (operation.equals("+")) {
      result = operand1+operand2;
    } else if (operation.equals("-")) {
      result = operand1-operand2;
    } else if (operation.equals("*")) {
      result = operand1*operand2;
    } else if (operation.equals("/")) {
    result = operand1/operand2;
    } else if (operation.equals("%")) {
    result = operand1%operand2;
    } else {
      System.out.println("Operation is not supported!");
    }
    System.out.println("The result will be " + result);
  }
}