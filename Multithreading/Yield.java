package Multithreading;

// yield() stops the execution of current thread & provides
// the chance to other threads having same or higher priority 
// to use the resources in the meantime but 
// it depends on the decision made by thread schedular
// which may accept as well as ignore the hint

public class Yield extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Thread.yield();
            System.out.println(i + " -> " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Yield obj = new Yield();
        obj.start();
        // Thread.yield();
        for (int i = 1; i <= 5; i++) {
            Thread.yield();
            System.out.println(i + " -> " + Thread.currentThread().getName());

        }
    }
}
