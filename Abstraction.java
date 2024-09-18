// hides the implementation not the data
// exposes interface to user
// Abstract class(0-100%) & Interfaces(100% abstraction achieved)

abstract class Vehicle {

    int no;

    abstract void start(); // has no definition, needs to be overridden in derived class
}

class Car extends Vehicle {
    void start() {
        System.out.println("starts with key");
    }
}

class Scooter extends Vehicle {
    void start() {
        System.out.println("starts with kick");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        // Vehicle v = new Vehicle(); - error since can't be instantiated

        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();

    }
}
