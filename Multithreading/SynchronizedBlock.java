package Multithreading;

// As Synchronization increases the waiting time of the threads,
// hence in order to reduce this issue
// we can synchronize only the small required portion of the shared resource
// instead of the whole resource

// this can be achieved using synchronized block

class BookingSeats2 {
    int total2 = 10;

    // shared resource
    void bookseats2(int seat) {
        System.out.println("Hi " + Thread.currentThread().getName());

        synchronized (this) {
            if (total2 >= seat) {
                System.out.println(seat + " Seats booked successfully");
                total2 = total2 - seat;
                System.out.println("Seats  left -> " + total2);

            } else {
                System.out.println("Unfortunately, Seats can't be booked");
                System.out.println("Seats left -> " + total2);
            }
        }
        System.out.println("Your booking is completed");
    }
}

public class SynchronizedBlock extends Thread {

    static BookingSeats2 b; // reference of the class

    int seat;

    public void run() {
        b.bookseats2(seat);
    }

    public static void main(String[] args) {

        b = new BookingSeats2();

        // After using synchronization,
        // each thread acquires lock on the shared resource till it
        // completes it's task and releases it after the completion
        // in the meantime, any other thread can't access shared resource

        // Threads can acquire locks in any order

        SynchronizedBlock obj1 = new SynchronizedBlock();
        obj1.seat = 7;
        obj1.start();

        SynchronizedBlock obj2 = new SynchronizedBlock();
        obj2.seat = 6;
        obj2.start();

    }
}
