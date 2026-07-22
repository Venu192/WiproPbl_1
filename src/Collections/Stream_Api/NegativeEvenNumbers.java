package Collections.Stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(-10);
        list.add(15);
        list.add(-8);
        list.add(22);
        list.add(-25);
        list.add(-18);
        list.add(7);
        list.add(-40);

        List<Integer> result = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original List : " + list);
        System.out.println("Negative Even Numbers : " + result);
    }
}
