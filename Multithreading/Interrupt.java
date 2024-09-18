package Multithreading;

// used to interrupt an executing Thread
// works only when Thread is in Sleeping or Waiting state
// throws InterruptedException

// interrupted() tells whether a Thread is interrupted or not
// & changes the result status from true to false as well

// isInterrupted() used for a static reference
// but does not changes the status

public class Interrupt extends Thread {

    public void run() {

        System.out.println("1." + Thread.interrupted()); // true -> false
        System.out.println("1." + Thread.interrupted());

        // System.out.println(Thread.currentThread().isInterrupted());
        // System.out.println(Thread.currentThread().isInterrupted());

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("\n" + i + " -> " + Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("2." + Thread.interrupted());

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        Interrupt obj1 = new Interrupt();
        obj1.start();

        obj1.interrupt();
    }
}
