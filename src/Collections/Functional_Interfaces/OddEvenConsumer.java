package Collections.Functional_Interfaces;

import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(13);
        list.add(20);
        list.add(17);
        list.add(12);
        list.add(25);
        list.add(40);
        list.add(7);
        list.add(2);

        Consumer<Integer> display = n -> {

            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };

        list.forEach(display);
    }
}