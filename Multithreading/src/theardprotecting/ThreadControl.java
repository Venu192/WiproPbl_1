package theardprotecting;

class MyThread extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            if (i == 5) {
                try {
                    Thread.sleep(5000);   // Delay for 5000 milliseconds (5 seconds)
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

public class ThreadControl {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();
    }
}
