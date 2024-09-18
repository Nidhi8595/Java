// 'super' keyword references to the object of parent/super class 
// while 'this' references to object of current class
// inheritance is must since Parent class is required

class Parent {

    int a = 10;

    void n1() {

        System.out.println("\nParent class");
    }

    Parent() {

        System.out.println("Parent class constructor");
    }
}

public class Super extends Parent {

    int a = 20;

    void show(int a) {

        System.out.println(a);
        System.out.println(this.a); // refers to current class
        System.out.println(super.a); // refers to Parent class :- // 1st use
    }

    void n1() {

        System.out.println("Derived class");
    }

    void show2() {

        // 2nd use
        super.n1();

        n1(); // current class
    }

    Super() {

        // 3rd use
        super(); // it can be done by default by compiler also
        System.out.println("Derived class constructor");
    }

    public static void main(String[] args) {

        Super obj = new Super();
        obj.show(30);
        obj.show2();
    }
}
