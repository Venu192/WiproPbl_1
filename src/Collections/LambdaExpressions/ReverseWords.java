package Collections.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Java");
        a1.add("Python");
        a1.add("HTML");
        a1.add("CSS");
        a1.add("Spring");
        a1.add("React");
        a1.add("Oracle");
        a1.add("MongoDB");
        a1.add("JavaScript");
        a1.add("SQL");

        Collections.reverse(a1);

        a1.forEach(word -> System.out.println(word));
    }
}