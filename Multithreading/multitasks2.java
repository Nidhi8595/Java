// performing multiple tasks from multiple thread 
// here all the tasks will be executed simultaneoulsy as they are performed by different threads

package Multithreading;

class Mythread1 extends Thread {

    public void run() {

        System.out.println("Task 1");
    }
}

class Mythread2 extends Thread {

    public void run() {

        System.out.println("Task 2");
    }
}

class Mythread3 extends Thread {

    public void run() {

        System.out.println("Task 3");
    }
}

public class multitasks2 {

    public static void main(String[] args) {

        Mythread1 obj1 = new Mythread1();
        obj1.start();

        Mythread2 obj2 = new Mythread2();
        obj2.start();

        Mythread3 obj3 = new Mythread3();
        obj3.start();

    }
}
