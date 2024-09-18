// Method overloading (compile-time) :-  same class, same name, diff. args
// return type is not associated with overloading
// main() can be overloaded(JVM considers only string args)
// 

public class Polymorphism {

    static int a = 7;
    static String b = "Overloading";

    void Display(int a) {
        System.out.println(a);
    }

    void Display(String b) { // Type of args
        System.out.println(a);
    }

    void Display(int a, String b) { // No. of args
        System.out.println(a + " " + b);
    }

    void Display(String b, int a) { // Sequence of args
        System.out.println(b + " " + a);
    }

    public static void main(String[] args) {

        Polymorphism p = new Polymorphism();

        p.Display(a);
        p.Display(b);
        p.Display(a, b);
        p.Display(b, a);

    }
}
