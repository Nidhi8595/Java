// performing single tasks from multiple thread

package Multithreading;

public class multithread extends Thread {

    public void run() {
        // task
        System.out.println("Thread task");
    }

    public static void main(String[] args) { // main thread created by JVM

        // 2nd thread
        multithread obj = new multithread();
        obj.start();

        // 3rd thread
        multithread obj2 = new multithread();
        obj2.start();
    }
}
