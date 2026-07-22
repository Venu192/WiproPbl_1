package Language_basics_M1.Conditional_Statements;

import java.util.Scanner;

public class SumLastDigits {
    static int sumLastDigits(int a, int b) {

        int last1 = Math.abs(a % 10);
        int last2 = Math.abs(b % 10);

        return last1 + last2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(sumLastDigits(a, b));

        sc.close();
    }
}
