package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

// implemented class of Set interface
// JDK 1.2 version
// underline D.S. is Hashtable
// Map works as a backup for a HashSet i.e.
// The data we store in a HashSet object is actually stored in a Map
// no indexing but HashCode values(unique integer values for each object)
// duplicacy not allowed
// Multiple NULL values not stored
// heterogenous values can be stored
// doesn't follows insertion order(cuz no indexing)
// or sorting order
// Non-Synchronized hence fast
// but not Thread Safe

public class hashSet {
    public static void main(String[] args) {

        HashSet h = new HashSet();
        System.out.println(h.add(10)); // returns true if inserted
        System.out.println(h.add("abc")); // heterogenous
        System.out.println(h.add(5.2));
        System.out.println(h.add(true));
        System.out.println(h.add(null));

        System.out.println("\n" + h.add(10)); // will return false since duplicacy not allowed
        System.out.println(h.add(null));

        System.out.println("\n" + h); // insertion order not followed

        Iterator itr = h.iterator();
        System.out.println();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ArrayList al = new ArrayList();
        al.add('a');
        al.add("abcde");
        al.add('b');

        h.addAll(al);

        System.out.println("\n" + h);

        System.out.println("\n" + h.contains("abc"));

        System.out.println("\n" + h.remove(10));
        System.out.println(h);

        System.out.println("\n" + h.size());

        h.clear(); // removes every element

        System.out.println("\n" + h);
    }
}
