public class Exercise05_Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(reversed));
    }

    public static String reverse(String reversed) {
        int n = reversed.length();
        char[] reversedChars = new char[n];

        for (int i = 0; i < n; i++) {
            reversedChars[n-i-1] = reversed.charAt(i);
        }
        String reversedString = new String(reversedChars);
        return reversedString;
        //or in one line: return String.valueOf(reversedChars);
    }

}
