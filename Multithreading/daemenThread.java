
// Daemen threads gets executed in the background to provide services to another thread.

// If we don't perform any task in the main thread,
// then daemen thread will also not be executed 
// since it's only task is to provide service to main thread
// inherits properties from parent thread

package Multithreading;

class Test1 extends Thread {

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemen thread");
        } else {
            System.out.println("Child thread");

        }

    }
}

public class daemenThread {
    public static void main(String[] args) {

        System.out.println("Main Thread");

        Test1 obj = new Test1();
        obj.setDaemon(true); // before start()
        obj.start();
        // otherwise throws exception
        // Test1 obj1 = new Test1();
        // obj1.start();
        // obj.setDaemon(true);

        // that's the reason we can't set main thread as a daemen thread since it gets
        // started first & after that can't be set daemen
        // Thread.currentThread().setDaemon(true);

        System.out.println(obj.isDaemon()); // true

        System.out.println(Thread.currentThread().isDaemon()); // false

        // also, daemen thread remains alive as long as main thread is alive

    }
}
