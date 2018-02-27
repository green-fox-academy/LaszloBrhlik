public class Exercise13 {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int maxHours = 17;
        int maxMinutes = 30;
        int maxSeconds = 0;

        int currentSumSeconds;
        int maxSumSeconds;

        currentSumSeconds = currentHours * 3600 + currentMinutes * 60 + currentSeconds;
        maxSumSeconds = maxHours * 3600 + maxMinutes * 60 + maxSeconds;

        System.out.println("Current seconds left: " + (maxSumSeconds-currentSumSeconds) + " sec");
    }

}
