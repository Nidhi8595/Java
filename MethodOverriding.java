// same name, diff. class, same args.
// Run-time (dynamic)
// Inheritance is mandatory
// Method access specifier in child class can allow equal or more , but not less access than the base class

// final method, private method & static method can't be overridden

class Test {

    // void Display() :- no error
    public void Display() {
        System.out.println("class -> Test");
    }

    // Not overrirding since arguments are diff. from the Display() in another class
    // void Display(String a) {
    // System.out.println("class -> Test");
    // }

    static void Show() {
        System.out.println("Super class");
    }
}

public class MethodOverriding extends Test {

    // void Display() :- error
    public void Display() {
        super.Display(); // calling Display method of parent class
        System.out.println("class -> Method Overriding");
    }

    // Method hiding
    static void Show() {
        System.out.println("Hey there");
    }

    public static void main(String[] args) {

        Test t = new Test();
        t.Display(); // class -> Test

        MethodOverriding m = new MethodOverriding();
        m.Display();
        // class -> Test
        // class -> Method Overriding

        // Error
        // t.Show();
        // m.Show();

    }
}
