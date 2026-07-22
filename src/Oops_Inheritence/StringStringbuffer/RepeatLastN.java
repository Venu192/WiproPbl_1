package Oops_Inheritence.StringStringbuffer;

import java.util.Scanner;

public class RepeatLastN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String last = str.substring(str.length() - n);

        for (int i = 1; i <= n; i++) {
            System.out.print(last);
        }

        sc.close();
    }
}
