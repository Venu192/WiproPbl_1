package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void printAll(ArrayList<String> list) {

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");

        printAll(list);
    }
}
