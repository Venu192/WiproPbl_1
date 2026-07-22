package Oops_Inheritence.Classes_Objects;

class Box {

    double width;
    double height;
    double depth;

    // Parameterized Constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}
public class BoxDemo {
    public static void main(String[] args) {

        Box b = new Box(10, 5, 2);

        System.out.println("Width : " + b.width);
        System.out.println("Height : " + b.height);
        System.out.println("Depth : " + b.depth);
        System.out.println("Volume : " + b.volume());
    }
}