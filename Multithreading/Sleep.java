package Multithreading;

// public class Sleep {
// public static void main(String[] args) {
// for (int i = 1; i <= 10; i++) {
// try {
// Thread.sleep(1000); // the main thread will go to sleep for this much time in
// each iteration
// System.out.println(i);

// } catch (InterruptedException e) {
// System.out.println();
// }
// }
// }
// }

public class Sleep extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); // in this case this thread will go to sleep in each
                // iteration i.e. Thread 0
                // not the main thread
                System.out.println(i + " -> " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Sleep obj = new Sleep();
        obj.start(); // Thread 0

        Sleep obj1 = new Sleep();
        obj1.start(); // Thread 1
    }
}

// public class Sleep extends Thread {

// public void run() {
// for (int i = 1; i <= 10; i++) {
// try {
// Thread.sleep(1000);
// System.out.println(i + " -> " + Thread.currentThread().getName());

// } catch (InterruptedException e) {
// System.out.println();
// }
// }
// }

// public static void main(String[] args) {
// Sleep obj = new Sleep();
// obj.run();

// Sleep obj1 = new Sleep();
// obj1.run();

// // in this case both these objects will be executed as main threads
// // & not as concurrent threads
// // since obj & obj1 are not Threads bcuz start() is not used
// }
// }
