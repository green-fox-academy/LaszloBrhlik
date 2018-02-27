public class Exercise09 {

    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        // Print the Body mass index (BMI) based on these values

        double heightInM2 = heightInM * heightInM;
        System.out.println("BMI: " + (massInKg/heightInM2));
    }

}
