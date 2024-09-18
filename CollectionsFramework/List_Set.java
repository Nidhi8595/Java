package CollectionsFramework;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

// both are Collection objects

// List :- index-based D.S.
//      :- duplicacy allowed
//      :- can store many null values
//      :- follows insertion order while retrieval
//      :- uses Iterator and ListIterator(forward & backward direction)
//      :- implemented classes -> 
//                         : LinkedList
//                         : ArrayList
//                         : Vector
//                         : Stack

// Set :- not based on index but hashCode values based
//     :- not allowed
//     :- can store only one
//     :- doesn't
//     :- uses Iterator only
//     :- implemented classes -> 
//                        : HashSet
//                        : LinkedHashSet
//                        : TreeSet

public class List_Set {
    public static void main(String[] args) {

        // List

        List l1 = new ArrayList();
        l1.add(0, 'a');
        l1.add(1, 'b');
        l1.add(2, 'c');

        System.out.println(l1); // insertion order

        l1.add(3, 'b'); // duplicacy
        System.out.println(l1);

        l1.add(4, null);
        l1.add(5, null);
        System.out.println(l1);

        // there are three cursors:- Iterator, ListIterator, Enumeration
        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // forward direction
        System.out.println();
        ListIterator itr3 = l1.listIterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        // backward direction
        System.out.println();
        ListIterator itr4 = l1.listIterator();
        // firstly move the cursor to the last index position
        for (int i = 0; i < l1.size(); i++) {
            itr4.next();
        }
        while (itr4.hasPrevious()) {
            System.out.println(itr4.previous());
        }

        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add("Hey");
        System.out.println(v1);

        // Enumeration introduced in JDK 1.2 version & can be used only with
        // Vector, Stack (i.e. Legacy classes)
        // used only for read operations
        // only forward
        System.out.println();
        Enumeration e1 = v1.elements();
        while (e1.hasMoreElements()) {
            System.out.println(e1.nextElement());
        }

        // Set

        Set s1 = new HashSet();
        s1.add("aaa");
        s1.add("bbb");
        s1.add("ccc");

        System.out.println("\n" + s1);

        System.out.println(s1.add("ccc")); // will not be added
        System.out.println(s1);

        s1.add(null);
        s1.add(null); // will not be added
        System.out.println(s1);

        Iterator itr2 = s1.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }
}
