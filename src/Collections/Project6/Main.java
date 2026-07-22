package Collections.Project6;

import java.util.*;

public class Main {

    public static ArrayList<String> stringOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // Operation 1
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        list.add(op1.toString());

        // Operation 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, last) + rev
                    + s1.substring(last + s2.length());
            list.add(op2);
        } else {
            list.add(s1 + s2);
        }

        // Operation 3
        if (first != last) {
            String op3 = s1.substring(0, first)
                    + s1.substring(first + s2.length());
            list.add(op3);
        } else {
            list.add(s1);
        }

        // Operation 4
        int n = s2.length();
        int split;

        if (n % 2 == 0)
            split = n / 2;
        else
            split = (n / 2) + 1;

        String op4 = s1.substring(split) + s1.substring(0, split);
        list.add(op4);

        // Operation 5
        String op5 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) != -1)
                op5 += "*";
            else
                op5 += s1.charAt(i);
        }
        list.add(op5);

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        ArrayList<String> result = stringOperations(s1, s2);

        System.out.println(result);

        sc.close();
    }
}
