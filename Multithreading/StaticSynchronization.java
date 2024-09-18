package Multithreading;

class BookingSeats3 {
    static int total3 = 20;

    // shared resource
    static synchronized void bookseats3(int seat) {

        System.out.println("\nHi " + Thread.currentThread().getName());

        if (total3 >= seat) {

            System.out.println(seat + " Seats booked successfully");
            total3 = total3 - seat;
            System.out.println("Seats  left -> " + total3);
        } else {

            System.out.println("Unfortunately, Seats can't be booked");
            System.out.println("Seats left -> " + total3);
        }

        System.out.println("Your booking is completed\n");
    }
}

class MyThread1 extends Thread {
    BookingSeats3 b; // reference of the class
    int seat;

    MyThread1(BookingSeats3 b, int seat) {

        this.b = b;
        this.seat = seat;
    }

    public void run() {

        b.bookseats3(seat);
    }
}

class MyThread2 extends Thread {
    BookingSeats3 b; // reference of the class
    int seat;

    MyThread2(BookingSeats3 b, int seat) {

        this.b = b;
        this.seat = seat;
    }

    public void run() {

        b.bookseats3(seat);
    }

}

public class StaticSynchronization {

    public static void main(String[] args) {

        BookingSeats3 b1 = new BookingSeats3();
        MyThread1 t1 = new MyThread1(b1, 7);
        t1.start();

        MyThread2 t2 = new MyThread2(b1, 6);
        t2.start();
        // till here, for the same object b1, there will be no issue

        // but if we create another object as
        BookingSeats3 b2 = new BookingSeats3();
        MyThread1 t3 = new MyThread1(b2, 5);
        t3.start();

        MyThread2 t4 = new MyThread2(b2, 9);
        t4.start();

        // now the threads belonging to different objects may interfere
        // & can cause data inconsistency
        // such as t1 and t4 or t2 and t3 etc
        // bcuz for each object it will provide new value to instance variables
    }
}
