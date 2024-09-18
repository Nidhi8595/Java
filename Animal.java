import java.util.*;

public class Animal {

    String name;
    String sound;

    public void initialize(String n, String s) {
        // for initialising attriutes
        name = n;
        sound = s;
    }

    public void voice() {
        System.out.println(name + " " + sound + "s");
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public void run() {
        System.out.println(name + " runs");
    }

    public static void main(String[] args) {

        Animal a1 = new Animal();
        /*
         * Objects
         * -> occupies memory / a class dosen't
         * -> real world entity
         * -> instance/ prototype of it's class
         * -> has :-
         * properties
         * behaviours / procedures / Instance Methods
         * attributes / states / Instance variables
         */

        // a1.name = "Dog";
        // a1.sound = "Barks";
        a1.initialize("Dog", "Bark");

        a1.voice();
        a1.eat();
        a1.run();

        System.out.println();

        Animal a2 = new Animal();
        // a2.name = "Cat";
        // a2.sound = "Meow";
        a2.initialize("Cat", "Meow");

        a2.voice();
        a2.eat();
        a2.run();

        System.out.println();

        Bird b1 = new Bird();
        // b1.name = "Sparrow";
        // b1.sound = "Chirp";
        b1.initialize("Sparrow", "Chirp");

        b1.voice(); // doesn't throw error
        b1.eat(); // doesn't throw error
        // b1.run(); error
        b1.fly();
    }
}

class Bird {

    String name;
    String sound;

    public void initialize(String n, String s) {
        name = n;
        sound = s;
    }

    public void voice() {
        System.out.println(name + " " + sound + "s");
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public void fly() {
        System.out.println(name + " flies");
    }
}
