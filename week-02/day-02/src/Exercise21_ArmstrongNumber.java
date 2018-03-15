import java.util.ArrayList;
import java.util.List;

public class Exercise21_ArmstrongNumber {

  public static void main(String[] args) {

    int number = 1634;
    int number2 = 1635;
    checkArmstrongNumber(number);
    checkArmstrongNumber(number2);
  }

  public static void checkArmstrongNumber(int number) {
    //Get digits of number to a list
    int temp = number;
    List<Integer> digits = new ArrayList<>();
    while (temp > 0) {
      digits.add(temp % 10);
      temp /= 10;
    }
    //Check if Armstrong number
    int sum = 0;
    for (int i = 0; i < digits.size(); i++) {
      sum += (int) Math.pow(digits.get(i), digits.size());
    }
    if (sum == number) {
      System.out.println(number + " is an Armstrong number! :)");
    } else {
      System.out.println(number + " is not an Armstrong number! :(");
    }
  }
}

