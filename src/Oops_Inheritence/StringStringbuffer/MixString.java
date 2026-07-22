package Oops_Inheritence.StringStringbuffer;

import java.util.Scanner;

public class MixString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.next();

        System.out.print("Enter second string: ");
        String b = sc.next();

        String result = "";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }

        if (a.length() > b.length()) {
            result = result + a.substring(min);
        } else if (b.length() > a.length()) {
            result = result + b.substring(min);
        }

        System.out.println(result);

        sc.close();
    }
}