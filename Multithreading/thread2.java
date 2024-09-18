package Multithreading;

// creating a thread using Runnable interface (which has only one method -> run())

// better way :- since java doesn't support multiple inheritance 
// so if the given class has already inherited some other class 
// then it will not have the option to inherit Thread class 
// & the only option left is to implement Runnable interface

public class thread2 implements Runnable {

    public void run() {

        // task
        System.out.println("Thread task");
    }

    public static void main(String[] args) {

        thread2 t = new thread2();

        Thread th = new Thread(t); // to use the start()
        th.start();

    }
}
