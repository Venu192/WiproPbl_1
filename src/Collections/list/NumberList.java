package Collections.list;

import java.util.ArrayList;

public class NumberList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20.5);
        numbers.add(30.45f);
        numbers.add(100L);

        System.out.println(numbers);
    }
}
