package Language_basics_M1.Conditional_Statements;

import java.util.Scanner;

public class LastDigit {

    static int lastDigit(int n) {
        return Math.abs(n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(lastDigit(n));
        sc.close();
    }
}
