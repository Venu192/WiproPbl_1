package theardprotecting;

class EvenThread extends Thread {

    public void run() {

        System.out.println("Even Numbers:");

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}

class OddThread extends Thread {

    public void run() {

        System.out.println("Odd Numbers:");

        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}

public class JoinDemo {

    public static void main(String[] args) {

        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();

        try {
            t1.join();      // Wait until EvenThread finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
}