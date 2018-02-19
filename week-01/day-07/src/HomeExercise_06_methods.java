public class HomeExercise_06_methods {

    public static void main(String[] args) {
        int d = 5;
        tryToChange(d);
        //how Java uses pass by value
        System.out.println("main d = " + d);
    }

    public static void tryToChange(int d) {
        d = d + 1;
        System.out.println("tryToChange d = " + d);
    }
}
