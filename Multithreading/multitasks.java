// performing multiple tasks from single thread :- not possible

package Multithreading;

public class multitasks extends Thread {

    public void run() {
        // task
        System.out.println("Thread task");
    }

    public static void main(String[] args) {

        multitasks obj = new multitasks();
        obj.start();

    }
}
