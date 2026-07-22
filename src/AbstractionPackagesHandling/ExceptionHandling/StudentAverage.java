package AbstractionPackagesHandling.ExceptionHandling;

import java.util.Scanner;

class NegativeValuesException extends Exception {

    public NegativeValuesException(String msg) {
        super(msg);
    }
}

class OutOfRangeException extends Exception {

    public OutOfRangeException(String msg) {
        super(msg);
    }
}

public class StudentAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name:");
                String name = sc.nextLine();

                int sum = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0)
                        throw new NegativeValuesException("NegativeValuesException");

                    if (mark > 100)
                        throw new OutOfRangeException("OutOfRangeException");

                    sum += mark;
                }

                System.out.println(name + " Average = " + (sum / 3.0));
            }

        } catch (NumberFormatException e) {

            System.out.println("java.lang.NumberFormatException");

        } catch (NegativeValuesException e) {

            System.out.println(e.getMessage());

        } catch (OutOfRangeException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
