package CollectionsFramework;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

// doesn't implements Collection Interface
// JDK 1.2 version
// stores Key-Value pairs
// Keys-> Unique, Values-> Maybe Duplicate
// only one Key can be NULL, 
// but more than one value can be NULL
// no Sorting & Insertion order

public class mapInterface {
    public static void main(String[] args) {
        Map m = new HashMap();

        m.put(1, 'A');
        m.put(2, 'B');
        m.put(4, 'C');
        m.put(null, 'D');
        m.put(6, null);
        m.put(9, null);

        System.out.println(m);

        System.out.println("\n" + m.containsKey(4));
        System.out.println(m.containsValue('C'));

        System.out.println("\n" + m.get(2)); // returns the value

        System.out.println("\n" + m.size());

        System.out.println("\n" + m.isEmpty());

        System.out.println(m.remove(9)); // returns deleted entry

        m.replace(2, 'F');
        System.out.println("\n" + m);

        Map m2 = new HashMap();

        m2.putAll(m);

        System.out.println("\n" + m2);
    }
}
