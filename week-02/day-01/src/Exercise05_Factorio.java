import java.util.Arrays;
import java.util.Scanner;

public class Exercise05_Factorio {

    public static void main(String[] args) {
        // - Create a function called `factorio`
        //   that returns it's input's factorial

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a number to count factorial: ");
        int numInput = scanner.nextInt();

        System.out.println("The factorial is = " + factorio(numInput));

    }
    public static int factorio(int counted) {
        int j = 1;
        for (int i = 1; i <= counted; i++) {
            j *= i;
        }
        return j;
    }
}
