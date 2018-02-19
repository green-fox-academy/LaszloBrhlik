public class Exercise06_Printer {

    public static void main(String[] args) {
        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourth")

        String[] input = {"first", "second", "third", "fourth"};

        printer(input);
    }
    public static void printer(String[] in) {
        for (String rows : in) {
            System.out.println(rows);
        }
    }
}
