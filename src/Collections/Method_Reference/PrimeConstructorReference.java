package Collections.Method_Reference;

interface PrimeCheck {
    PrimeNumber create(int n);
}

class PrimeNumber {

    PrimeNumber(int n) {

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
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

public class PrimeConstructorReference {

    public static void main(String[] args) {

        PrimeCheck pc = PrimeNumber::new;

        pc.create(17);
    }
}
