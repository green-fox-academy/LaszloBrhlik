public class HomeExercise_03_methods {

    static double myPI = 3.14159; //class variable

    public static void main(String[] args){
        addThem1(1,2); //call the addThem method
        System.out.println("Global " + myPI);
    }

    public static int addThem1(int a, int b) {
        double smallPI = 3.140; //local variable
        double myPI = 3.0; //overwrite global variable to local
        System.out.println("Local " + myPI);
        return 1; //because this returns a value of int, give it a junk value of return one
    }
}
