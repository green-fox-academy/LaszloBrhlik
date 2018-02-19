import java.util.Arrays;

public class HomeExercise_08_methods {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];

        //System.arraycopy()
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo)); //defined as a new String
        System.out.println(copyTo);
        System.out.println(Arrays.toString(copyTo)); //need to import java.util.Arrays for this

        //Arrays.copyOfRange()
        copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 7); //without importing java.util.Arrays
        System.out.println(copyTo);
        System.out.println(Arrays.toString(copyTo)); //need to import java.util.Arrays for this

        //Arrays.copyOf()
        copyTo = Arrays.copyOf(copyFrom, 10); //length of the new array
        System.out.println(Arrays.toString(copyTo));
        System.out.println(copyTo);

        //Major difference:
        //Arrays.copyOf() does not only copy elements, but also creates a new array
    }
}
