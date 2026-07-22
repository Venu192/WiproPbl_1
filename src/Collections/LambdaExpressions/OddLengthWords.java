package Collections.LambdaExpressions;

import java.util.ArrayList;

public class OddLengthWords {

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

        System.out.println("Odd Length Strings:");

        a1.forEach(word -> {

            if (word.length() % 2 != 0)
                System.out.println(word);

        });
    }
}
