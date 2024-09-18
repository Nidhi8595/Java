package Multithreading;

// To avoid data inconsistency & Thread interference, we use synchronization
// by controlling the accessibility of multiple threads 
// to a particular shared resource
// it increases the waiting time of threads 
// leading to performance problems

class BookingSeats {
    int total = 10;

    // shared resource
    synchronized void bookseats(int seat) {
        if (total >= seat) {
            System.out.println(seat + " Seats booked successfully");
            total = total - seat;
            System.out.println("Seats  left -> " + total);

        } else {
            System.out.println("Seats can't be booked");
            System.out.println("Seats left -> " + total);
        }
    }
}

public class Synchronization extends Thread {

    static BookingSeats b; // reference of the class

    int seat;

    public void run() {
        b.bookseats(seat);
    }

    public static void main(String[] args) {

        b = new BookingSeats();

        // After using synchronization,
        // each thread acquires lock on the shared resource till it
        // completes it's task and releases it after the completion
        // in the meantime, any other thread can't access shared resource

        // Threads can acquire locks in any order

        Synchronization obj1 = new Synchronization();
        obj1.seat = 7;
        obj1.start();

        Synchronization obj2 = new Synchronization();
        obj2.seat = 6;
        obj2.start();

        // O/P in this case without using 'synchronized' method would be:-
        // 7 Seats booked successfully
        // 6 Seats booked successfully
        // Seats left -> 3
        // Seats left -> -3
        // which can keep changing as well leading to data inconsistency

    }
}
