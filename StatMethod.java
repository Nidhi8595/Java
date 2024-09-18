// called using class name not object
// can access only static data / not instance
// can call only other static methods/ not non-static ones
// can't refer to this or super keyword

class Static {

    int a = 10;
    static int b = 8;

    Static() {

        System.out.println("\nconstructor invoked");
    }

    void Display2() {

        System.out.println("non-static method");
    }

    static void m1() {

        // this(); :- error
        System.out.println("first static method");
    }

    static void Display() {

        // System.out.println(a); :- error
        System.out.println(b);

        // Display2(); :- error
        m1();
        System.out.println("second static method");
    }
}

public class StatMethod {
    public static void main(String[] args) {

        Static.Display();

        // Static.Display2(); :- error

        Static obj = new Static();
        obj.Display2();
    }
}
