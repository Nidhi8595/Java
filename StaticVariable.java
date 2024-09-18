// static - non access modifier
// can be used with class level variables , not local variables

class test {

    static int m = 7;
}

class employee {

    int empId;
    String name;
    // String Company;
    static String Company = "XYZ"; // since each employee is woorking uder same company : hence memory saved

    employee(int empId, String name) {

        this.empId = empId;
        this.name = name;
    }

    void Display() {

        System.out.println("\n" + empId + " " + name + " " + Company);
    }

}

public class StaticVariable {

    int a = 5; // instance
    static int b = 10; // static

    void show() {

        int n = 8;
        // static int m; :- error

        System.out.println("Local variable -> " + n);
    }

    public static void main(String[] args) {

        StaticVariable obj = new StaticVariable();

        obj.show();
        // System.out.println(a); :- error since instance variable needs an oject
        System.out.println(obj.a);

        System.out.println(b); // no need of object and class name as well since same class

        System.out.println(test.m); // here class name is required

        employee e1 = new employee(101, "A");
        employee e2 = new employee(102, "B");
        e1.Display();
        e2.Display();
    }
}
