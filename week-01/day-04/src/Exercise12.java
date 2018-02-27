public class Exercise12 {

    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double length = 5;
        double depth = 6;
        double height = 7;

        double surface = length * depth;
        double volume = length * depth * height;

        System.out.println("Area of the cuboid is: " + surface);
        System.out.println("Volume of the cuboid is: " + volume);
    }

}
