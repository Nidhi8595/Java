// all the methods should be of abstract type and should be defined compulsorily in the inheriting class as well
// blueprint of a class :- what to do / not how to
// supports multiple inheritance & loose coupling (stability) as well
// access specifier :- public

interface i {

    int a = 10;

    // void Display(); :- also correct
    abstract void Display(); // public by default

    default void show() {
        System.out.println("default method of interface");
    }

    public static void display2() {
        System.out.println("static method of interface");
    }

    private void display3() {
        System.out.println("private method of interface");
    }
}

// interface i2 {
// void add(int b, int c);
// }

// or
interface i2 extends i {
    void add(int b, int c);
}

public class Interface implements i2 {

    // void Display() :- error since the visibility must not be reduced to private

    public void Display() {

        System.out.println("interface implemented");
        System.out.println(a);
    }

    public void add(int b, int c) {

        int sum = b + c;
        System.out.println("\nSum -> " + sum);
    }

    public static void display2() {
        System.out.println("static method of class");
    }

    public static void main(String[] args) {

        // i obj1 = new i(); can't be instantiated

        Interface obj = new Interface();
        obj.Display();
        obj.add(5, 2);
        obj.show();
        Interface.display2(); // accessed using class not object

        // obj.display3(); - error since the visibility of private method will be
        // limited upto interface only

    }

}
