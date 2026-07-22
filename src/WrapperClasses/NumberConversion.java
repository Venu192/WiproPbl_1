package WrapperClasses;

public class NumberConversion {

    public static void main(String[] args) {

        try {

            int num = Integer.parseInt(args[0]);

            System.out.println("Given Number : " + num);
            System.out.println("Binary equivalent : " + Integer.toBinaryString(num));
            System.out.println("Octal equivalent : " + Integer.toOctalString(num));
            System.out.println("Hexadecimal equivalent : " + Integer.toHexString(num));

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Please enter a number.");

        } catch (NumberFormatException e) {

            System.out.println("Please enter a valid integer.");
        }
    }
}
