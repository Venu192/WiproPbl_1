package Oops_Inheritence;

class Calculator {
    // Static method for int
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method for double
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}
public class CalculaterDemo {

    public static void main(String[] args) {
        System.out.println("Power Int = " + Calculator.powerInt(2, 3));
        System.out.println("Power Double = " + Calculator.powerDouble(2.5, 3));
    }
}
