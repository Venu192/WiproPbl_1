package Language_basics_M1.Conditional_Statements;

import java.util.Scanner;

public class SecondLastDigit {
    static int secondLastDigit(int n) {
        n = Math.abs(n);
        if (n < 10)
            return -1;

        return (n / 10) % 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(secondLastDigit(n));
        sc.close();
    }
}
