package Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("USA");
        ts.add("Japan");
        ts.add("Australia");
        ts.add("Canada");

        System.out.println("TreeSet:");
        System.out.println(ts);

        System.out.println();

        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());

        System.out.println();

        System.out.println("Using Iterator:");

        Iterator<String> it = ts.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        System.out.println("Contains India : " + ts.contains("India"));
        System.out.println("Contains Nepal : " + ts.contains("Nepal"));
    }
}
