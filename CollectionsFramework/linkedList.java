package CollectionsFramework;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

// index-based D.S.
// can store homogenous as well as different datatypes
// duplicacy allowed
// can store multiple null values
// follows the insertion order
// doesn't follows sorting order
// Non-Synchronized
// not Thread-Safe

public class linkedList {
    public static void main(String[] args) {

        // 1) Empty constructor
        LinkedList l1 = new LinkedList();
        l1.add(0, "Black");
        l1.add(1, "White");
        l1.add(2, "Blue");
        l1.add(3, "Pink");
        l1.add(4, "Red");
        l1.add(5, 20);
        l1.add(6, null);
        l1.add(7, 10);
        l1.add(8, "White"); // duplicacy
        l1.add(9, null);
        System.out.println(l1);

        // 2) Collection object parameterized constructor
        ArrayList a1 = new ArrayList();
        a1.add(0, 10);
        a1.add(1, 20);
        a1.add(2, 90);
        a1.add(3, 70);
        a1.add(4, 60);
        LinkedList l2 = new LinkedList(a1);
        System.out.println("\n" + l2);

        // implements List & deque hence all their methods

        // addFirst()
        l1.addFirst("Lavender");
        System.out.println("\n" + l1);

        // addLast()
        l1.addLast(40);
        System.out.println("\n" + l1);
        l1.addLast(60);
        System.out.println(l1);

        // removeFirst()
        System.out.println("\n" + l1.removeFirst()); // returns the deleted element
        System.out.println(l1);

        // removeLast()
        System.out.println("\n" + l1.removeLast()); // returns the deleted element
        System.out.println(l1);

        // getFirst()
        System.out.println("\n" + l1.getFirst());

        // getLast()
        System.out.println("\n" + l1.getLast());

    }
}
