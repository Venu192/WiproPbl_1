package AbstractionPackagesHandling.ExceptionHandling;

public class MathOperation {

    public static void main(String[] args) {

        try {

            if (args.length != 5) {
                throw new IllegalArgumentException("Please enter exactly 5 integers.");
            }

            int arr[] = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }

            double average = (double) sum / 5;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
