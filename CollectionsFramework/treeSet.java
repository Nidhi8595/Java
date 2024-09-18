package CollectionsFramework;

import java.util.TreeSet;

// a class that directly implements interface "NavigableSet"
// & indirectly implements Set interface
// JDK 1.2 version
// underline D.S. Balanced tree
// no indexing, insertion order 
// follows Sorting order that's why
// homogenous data values in order to compare them 
// duplicacy not allowed
// Non-Synchronized hence not Thread Safe
// NULL value can't be stored as it's
//  not comparable to any data value

public class treeSet {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();

        System.out.println(t.add(10));
        System.out.println(t.add(30));
        System.out.println(t.add(60));
        System.out.println(t.add(20));

        System.out.println();
        try {
            System.out.println(t.add('a')); // will not be inserted

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println();
        try {
            System.out.println(t.add(null));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n" + t); // sorted order bcuz of it's underline D.S.

        t.clear();
        System.out.println("\n" + t);

        TreeSet t2 = new TreeSet();

        System.out.println("\n" + t2.add("White"));
        System.out.println(t2.add("Blue"));
        System.out.println(t2.add("Yellow"));
        System.out.println(t2.add("Black"));
        System.out.println(t2.add("Purple"));

        System.out.println("\n" + t2); // Alphabetical order

    }
}
