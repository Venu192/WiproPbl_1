package Oops_Inheritence.String_Joiner;

import java.util.StringJoiner;

public class StringJoinerExample2 {

    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");

        s1.add("Mumbai");
        s1.add("Delhi");
        s1.add("Chennai");

        StringJoiner s2 = new StringJoiner("-");

        s2.add("Hyderabad");
        s2.add("Bangalore");
        s2.add("Pune");

        // s1 merged to s2
        StringJoiner merge1 = new StringJoiner("-");
        merge1.add("Hyderabad");
        merge1.add("Bangalore");
        merge1.add("Pune");
        merge1.merge(s1);

        System.out.println("s1 merged to s2:");
        System.out.println(merge1);

        // s2 merged to s1
        StringJoiner merge2 = new StringJoiner("-");
        merge2.add("Mumbai");
        merge2.add("Delhi");
        merge2.add("Chennai");
        merge2.merge(s2);

        System.out.println("\ns2 merged to s1:");
        System.out.println(merge2);
    }
}
