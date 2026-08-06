package mini;




class RaceThread extends Thread {

    private static volatile boolean raceFinished = false;
    private String threadName;

    public RaceThread(String name) {
        super(name);
        threadName = name;
    }

    @Override
    public void run() {

        for (int meter = 1; meter <= 100 && !raceFinished; meter++) {

            System.out.println(threadName + " ran " + meter + " meters");

            // Hare sleeps after reaching 60 meters
            if (threadName.equals("Hare") && meter == 60) {
                System.out.println("Hare is sleeping for 1000 milliseconds...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            // Small delay so both threads can execute
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            // Check winner
            if (meter == 100 && !raceFinished) {
                raceFinished = true;
                System.out.println("\n***************");
                System.out.println(threadName + " wins the race!");
                System.out.println("***************");
            }
        }
    }
}

public class miniproject {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        // Hare gets higher priority
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}
