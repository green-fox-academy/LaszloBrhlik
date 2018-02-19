import java.util.Arrays;

public class HomeExercise_02_multiArray {

    public static void main(String[] args) {

        String[][] multiArray = new String[10][10];
        for (int i=0; i < multiArray.length; i++) {
            for (int j=0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i +""+ j;
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
