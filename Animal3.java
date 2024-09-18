// Inheritance

// Constructor is never inherited
// only members are inherited i.e. Methods, Nested classes and fields(attributes)
// Java doesn't allows multiple (hence only one super class) & Hybrid inheritance

class Bird {

    public String name = "Bird";

    private void HasWings() {
        System.out.println(name + "has wings");
    }

    public void fly() {
        System.out.println(name + "flies");
    }

}

class Animal3 extends Bird {

    String name;
    String sound;

    Animal3(String n, String s) {
        name = n;
        sound = s;
    }

    void voice() {
        System.out.println(name + " " + sound + "s");
    }

    void eat() {
        System.out.println(name + " eats ");
    }

    void run() {
        System.out.println(name + " runs");
    }

    public static void main(String[] args) {

        Animal3 a1 = new Animal3("Cat", "Meow");
        a1.voice();
        a1.eat();
        a1.run();

        System.out.println();

        Animal3 a2 = new Animal3("Sparrow", "Chirp");
        a2.voice();
        a2.eat();
        a2.fly();
        // a2.HasWings(); private method can't be inherited

    }
}
