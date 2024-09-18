package CollectionsFramework;

import java.util.ArrayList;

// implements List interface
// created on basis of growable or resizable array
// doesn't follows sorting order
// Non-Synchronized
// Not thread safe, hence data inconsistency

public class arrayList {
    public static void main(String[] args) {

        // 1) Empty constructor
        // has initial capacity -> 10
        ArrayList a1 = new ArrayList();

        // 2) Initialized constructor
        // we can provide capacity
        ArrayList a2 = new ArrayList(6);
        a2.add(0, 10);
        a2.add(1, 20);
        a2.add(2, 30);
        a2.add(3, 40);
        a2.add(4, 50);
        System.out.println(a2);

        // 3) Collection parameterized constructor
        ArrayList a3 = new ArrayList(a2);
        System.out.println("\n" + a2);

        // containsAll()
        System.out.println("\n" + a3.containsAll(a2)); // true

        // does not follows the sorting order
        ArrayList a4 = new ArrayList();
        a4.add(0, 10);
        a4.add(1, 90);
        a4.add(2, 30);
        a4.add(3, 70);
        a4.add(4, 20);
        a4.add(5, "abc");
        System.out.println("\n" + a4);

        // get()
        System.out.println("\n" + a4.get(3));
        System.out.println(a4.get(5));

        // indexOf() :- returns index position of given element
        System.out.println("\n" + a4.indexOf(30));
        System.out.println(a4.indexOf("abc"));

        // remove() :-
        System.out.println("\n" + a4.remove("abc")); // object :- returns true
        System.out.println(a4.remove(2)); // index :- returns the deleted value as well
        System.out.println(a4);

        // set() : - a particular element at a particular index
        a4.set(1, 93);
        System.out.println("\n" + a4);

        //

    }

}
