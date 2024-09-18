package Multithreading;

// A Thread releases a lock & enter into waiting state
// & another Thread acquires the lock & continues execution

// using some 'Object Class' Methods :-
// wait()
// notify()
// notifyAll()

class TotalEarning extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}

public class InterThreadCommunication {

    public static void main(String[] args) throws InterruptedException {
        TotalEarning obj1 = new TotalEarning();
        obj1.start();

        // System.out.println("Total earnings -> " + obj1.total + " Rs");

        // we need the main thread to wait till the thread-0 performs it's calculations,
        // before printing this final
        // result & hence we use wait()

        synchronized (obj1) {
            obj1.wait();
            System.out.println("Total earnings -> " + obj1.total + " Rs");
        }
    }
}
