import java.util.*;

//Creating a parent class.  
class Vehicle {
    // defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Creating a child class
class child extends Vehicle {
    // defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class override {

    public static void main(String[] args) {
        child obj = new child();// creating object
        obj.run();// calling method
    }
}
