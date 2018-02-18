public class Exercise01 {

        public static void main(String[] args) {
            // Modify this program to greet you instead of the World!

            System.out.println("Do you speak spanish?");
            String si = "S\u00ED Se\u00F1or";

            //UTF-8/16 char set :)
            //Note, that 'String' is not a primitive data type
            //That is just a sequence of characters

            System.out.println(si);
        }

}