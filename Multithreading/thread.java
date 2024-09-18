package Multithreading;

// belongs to java.lang
// Lifecycle of a thread

/* create using run() overriding
 * runnable state using start() -> thread schedular (a part of JVM) decides to allocate processor based on scheduling algo
 * running state :- performing the task
 * non-runnable state :- waiting state  or sleep() or suspended // disturbance
 * dead state :- task completed // last stage
 */

//  creating thread using Thread class
public class thread extends Thread {

    public void run() {// overriding the run() in thread class

        // task
        System.out.println("Thread task");

    }

    public static void main(String[] args) {

        thread t = new thread();

        // t.run(); - it will not create the thread
        t.start(); // to invoke the thread created
        // t.start(); :- error since can be invoked only once
    }
}
