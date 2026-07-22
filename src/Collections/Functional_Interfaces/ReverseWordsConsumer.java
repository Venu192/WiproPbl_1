package Collections.Functional_Interfaces;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("HTML");
        list.add("CSS");
        list.add("Oracle");
        list.add("Spring");
        list.add("React");
        list.add("MongoDB");
        list.add("SQL");
        list.add("Wipro");

        Consumer<ArrayList<String>> reverseWords = l -> {

            for (int i = 0; i < l.size(); i++) {

                String rev = new StringBuilder(l.get(i)).reverse().toString();

                l.set(i, rev);
            }
        };

        reverseWords.accept(list);

        System.out.println(list);
    }
}
