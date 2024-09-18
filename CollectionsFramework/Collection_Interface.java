package CollectionsFramework;

import java.util.Collection;
import java.util.ArrayList;

// introduced in 1.2 version
// no class directly inherits CollectionInterface
// since collection is an interface, we can't create it's objects
// so the classes which indirectly inherit CollectionInterface, they can be used to create objects
// e.g -> ArrayList which inherits CollectionInterface through List Interface
// collection -> interface , collections -> class

public class Collection_Interface {
    public static void main(String[] args) {

        // Methods :-

        // 1) add() -> used to add an element into a collection object
        // -> returns a boolean value whether the element is added successfully
        ArrayList a1 = new ArrayList();
        System.out.println(a1.add(100)); // true
        System.out.println(a1.add(200)); // true
        System.out.println(a1.add(300)); // true
        System.out.println(a1);

        ArrayList a2 = new ArrayList();
        a2.add("aaa");
        a2.add("bbb");
        a2.add("ccc");
        System.out.println(a2);

        // 2) addAll() -> used to add elements of a collection object to a new
        // collection object
        System.out.println("\n" + a1.addAll(a2));
        System.out.println(a1);

        // 3) contains() -> checks whether an element is present in a collection object
        System.out.println("\n" + a1.contains(200));
        System.out.println(a1.contains('a')); // false
        System.out.println(a1.contains("ccc"));

        // 4) isEmpty() -> checks if an collection object is empty
        ArrayList a3 = new ArrayList();
        System.out.println("\n" + a3.isEmpty());
        System.out.println(a2.isEmpty()); // false

        // 5) size() -> returns the size of collection object
        System.out.println("\n" + a1.size());
        System.out.println(a2.size());
        System.out.println(a3.size());

        // 6) remove() -> deletes an element from collection object
        // for ArrayList particularly, it accepts index also
        System.out.println("\n" + a1.remove("bbb"));
        System.out.println(a1);

        // 7) removeAll() -> deletes entire collection object from another collection
        // object
        System.out.println("\n" + a1.removeAll(a2));
        System.out.println(a1);

        // 8) clear() -> deletes every element from a collection object
        // doesn't return any value
        System.out.println("\n" + a2);
        a2.clear();
        System.out.println(a2);
    }
}
