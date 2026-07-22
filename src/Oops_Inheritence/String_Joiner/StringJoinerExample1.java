package Oops_Inheritence.String_Joiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerExample1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Ravi");
        names.add("Sajid");
        names.add("Kiran");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}
