import java.util.*;

public class Animal2 {

    String name;
    String sound;

    // paramterized constructor
    public Animal2(String n, String s) {
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

    // Non-parameterized constructor
    public Animal2() {
        name = "Sparrow";
        sound = "Chirp";
    }

    public void fly() {
        System.out.println(name + " flies");
    }

    public static void main(String[] args) {

        Animal2 a1 = new Animal2("Dog", "Bark");

        a1.voice();
        a1.eat();
        a1.run();

        System.out.println();

        Animal2 a2 = new Animal2("Cat", "Meow");

        a2.voice();
        a2.eat();
        a2.run();

        System.out.println();

        Animal2 b1 = new Animal2();

        b1.voice();
        b1.eat();
        b1.fly();
    }
}
