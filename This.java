// this -> reference variable 
// must be used in case the args and local variable has the same name

class Test {

    int i;

    // void setValue(int x) {
    // i = x;
    // }

    // 1st use
    void setValue(int i) {

        // i = i; :- will assign a default value 0
        this.i = i;
    }

    void Show() {
        System.out.println("\nHey there! ");
    }

    // 2nd use
    void Display() {

        // using this to invoke a method implicitly
        this.Show(); // Show(); in this case compiler will automatically invoke this keyword

        System.out.println(i);
    }

    Test() {

        System.out.println("\nNon-parameterised constructor invoked");
    }

    // 3rd use
    Test(int a) {

        this(); // it will invoke non-paramterised constructor of this class

        System.out.println("Parameterised constructor invoked");
        System.out.println(a);
    }

    void m1(Test t3) {

        System.out.println("m1 Method");
    }

    // 4th use
    void m2() {

        m1(this);
    }

    Test(This t4) {

        System.out.println("\nobject parameterised constructor");
    }
}

public class This {

    // 5th use
    void m3() {

        Test t5 = new Test(this);
    }

    public static void main(String[] args) {

        Test t = new Test();

        t.setValue(8);
        t.Display();
        t.m2();

        Test t2 = new Test(7);

        This th = new This();
        th.m3();

    }
}
