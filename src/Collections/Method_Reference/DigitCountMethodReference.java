package Collections.Method_Reference;

interface DigitCount {
    int count(int n);
}

class NumberUtil {

    public static int digitCount(int n) {

        n = Math.abs(n);

        if (n == 0)
            return 1;

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }
}

public class DigitCountMethodReference {

    public static void main(String[] args) {

        DigitCount dc = NumberUtil::digitCount;

        System.out.println("Digits = " + dc.count(123456));
    }
}
