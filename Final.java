// can be used for methods (can't be overrided), variables (symbolic constants) or class (can't be inherited) only

final class Parent1 {

}

class Parent2 {

    void show1() {

        System.out.println("not a final method, can be overrided");
    }

    final void show2() {

        System.out.println("final method, can't be overrided");
    }
}

// public class Final extends Parent1 { ;- error since final

public class Final extends Parent2 {

    final int i = 10;

    void seti(int a) {

        // i=a; :- error
    }

    void show1() {

        System.out.println("method overrided");
    }

    // void show2(){} :- error

    public static void main(String[] args) {

        Final obj = new Final();
        obj.show1();
    }
}
