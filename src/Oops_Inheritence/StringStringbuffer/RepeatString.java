package Oops_Inheritence.StringStringbuffer;

import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        String firstTwo = str.substring(0, 2);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(firstTwo);
        }

        sc.close();
    }
}
