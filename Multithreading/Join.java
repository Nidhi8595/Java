package Multithreading;

// when a given thread waits for another thread to execute firstly 
// & then joins the execution

public class Join extends Thread {
    static Thread mainthreadreference;

    public void run() {
        // try {
        // mainthreadreference.join();
        // // now this thread will wait until main thread completes it's task
        // } catch (InterruptedException e) {
        // System.out.println(e);
        // }

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(100);
                System.out.println(i + " -> " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        mainthreadreference = Thread.currentThread();

        Join obj = new Join();
        obj.start();

        // try {
        // obj.join();
        // // now this main thread will wait until obj thread completes it's task
        // } catch (InterruptedException e) {
        // System.out.println(e);
        // }

        for (int i = 1; i <= 5; i++) {
            try {
                obj.join();
                Thread.sleep(100);
                System.out.println(i + " -> " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
