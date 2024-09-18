package CollectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// collection :- a single entity which can store multiple data of various types
// collection framework :- a library of classes, methods & interfaces related to collections 
// contains two main parts -> java.util.collection & java.util.Map

public class CollectionFramework {
    public static void main(String[] args) {

        ArrayList a = new ArrayList(); // collection of objects
        a.add(10);
        a.add("Neelakshi");
        a.add('e');

        HashSet h1 = new HashSet(); // collection of objects
        h1.add("abcde");
        h1.add(10);
        h1.add("c");

        HashMap h2 = new HashMap();
        h2.put(1, 'a');
        h2.put(2, 'e');
        h2.put(3, 'i');
        h2.put(4, 'o');
        h2.put(5, 'u');

    }
}
