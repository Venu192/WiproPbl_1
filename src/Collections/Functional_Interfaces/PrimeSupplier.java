package Collections.Functional_Interfaces;

import java.util.ArrayList;
import java.util.function.Supplier;

public class PrimeSupplier {

    public static void main(String[] args) {

        Supplier<ArrayList<Integer>> supplier = () -> {

            ArrayList<Integer> primes = new ArrayList<>();

            int number = 2;

            while (primes.size() < 10) {

                boolean prime = true;

                for (int i = 2; i <= Math.sqrt(number); i++) {

                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime)
                    primes.add(number);

                number++;
            }

            return primes;
        };

        ArrayList<Integer> result = supplier.get();

        System.out.println("First 10 Prime Numbers:");
        System.out.println(result);
    }
}
