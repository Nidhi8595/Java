package Multithreading;

class Methods extends Thread {

    public void run() {

        System.out.println("Thread task");
        System.out.println("This thread is -> " + Thread.currentThread().getName());
        Thread.currentThread().setName(" thread Name changed");
        System.out.println("This thread is -> " + Thread.currentThread().getName());

    }

    // consructor 1 :- default
    // Thread();

    // constructor 2 :- parameterized

    // Thread(Runnable arg);

    // constructor 3 :- provide name to thread, otherwise provided by JVM itself
    // Thread(String name)

    // constructor 4
    // Thread(Runnable arg, String name)

}

public class threadClassMethods {
    public static void main(String[] args) {
        Methods obj = new Methods();

        /* Basic Methods :- */

        // .run()

        // .start()
        obj.start();
        System.out.println(Methods.currentThread()); // static method - provides thread reference
        System.out.println(obj.isAlive()); // true if the thread is not in dead state yet

        /* Naming methods :- */

        obj.setName("This is thread 1");
        System.out.println(obj.getName());

        System.out.println(Thread.currentThread().getName()); // name of current thread executed by JVM (main)
        Thread.currentThread().setName("This is main thread");
        System.out.println(Thread.currentThread().getName());

        // checking the name that will be shown in exception now
        /*
         * int a = 10, b = 0, c;
         * c = a / b;
         * System.out.println(c);
         */

        /* Daemon methods */
        // Daemon threads works in background of other threads & provides service to
        // them
        // e.g. garbage collector, finallize
        System.out.println(obj.isDaemon()); // tells if the given thread is daemon or not

        /* Priority related methods */

        obj.setPriority(2);
        System.out.println(obj.getPriority());

        /* prevent thread executuion */

        // sleep()
        // yield()
        // join()

        /* Interruption related methods */

        System.out.println(obj.isInterrupted());

        obj.interrupt();
        System.out.println(obj.isInterrupted());

    }

}
