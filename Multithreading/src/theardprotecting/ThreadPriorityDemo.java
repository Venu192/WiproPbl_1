package theardprotecting;



class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println(getName() + " completed.");
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

    	PriorityThread t1 = new PriorityThread("MAX Thread");
    	PriorityThread t2 = new PriorityThread("NORM Thread");
    	PriorityThread t3 = new PriorityThread("MIN Thread");

        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MIN_PRIORITY);   // 1

        t1.start();
        t2.start();
        t3.start();
    }
}