package Collections.Functional_Interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("python");
        words.add("radar");
        words.add("hello");
        words.add("civic");
        words.add("apple");
        words.add("refer");
        words.add("wipro");

        Predicate<String> palindrome = word -> {

            String rev = new StringBuilder(word).reverse().toString();

            return word.equalsIgnoreCase(rev);
        };

        System.out.println("Palindrome Words:");

        words.stream()
                .filter(palindrome)
                .forEach(System.out::println);
    }
}
