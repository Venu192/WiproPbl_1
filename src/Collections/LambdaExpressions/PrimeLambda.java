package Collections.LambdaExpressions;

import java.util.ArrayList;

public class PrimeLambda {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(10);
        a1.add(13);
        a1.add(17);
        a1.add(20);
        a1.add(23);
        a1.add(25);
        a1.add(29);
        a1.add(31);
        a1.add(35);
        a1.add(37);
        a1.add(40);
        a1.add(41);
        a1.add(43);
        a1.add(45);
        a1.add(47);
        a1.add(50);
        a1.add(53);
        a1.add(55);
        a1.add(59);
        a1.add(61);
        a1.add(65);
        a1.add(67);
        a1.add(71);
        a1.add(73);
        a1.add(79);

        System.out.println("Prime Numbers:");

        a1.forEach(n -> {
            boolean prime = true;

            if (n < 2)
                prime = false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(n + " ");
        });
    }
}
