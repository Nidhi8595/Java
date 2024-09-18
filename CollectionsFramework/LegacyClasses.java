package CollectionsFramework;

import java.util.Vector;

// JDK 1.0 introduced classes & interfaces in which we can store data/ objects
// e.g. -> Vector, Stack, HashTable, Properties, Dictionary
// Vector :- implements List
//        :- underline D.S. 
//        :- index-based D.S.
//        :- Heterogenous data types stored
//        :- duplicacy allowed
//        :- follows insertion order / not sorting order
//        :- Synchronized *
//        :- contains List & Collection methods

public class LegacyClasses {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("aaa");
        v1.add(1, "bbb");
        v1.add("ccc");

        v1.add("ddd");
        v1.add("eee");
        System.out.println(v1);

        v1.addElement("abc"); // returns void
        System.out.println("\n" + v1);

        // removeElementAt()
        v1.removeElementAt(2);
        System.out.println("\n" + v1);

        // removeElement()
        System.out.println("\n" + v1.removeElement("bbb"));
        System.out.println(v1);

        // setElementAt() :- replaces the original element
        v1.setElementAt("def", 2);
        System.out.println("\n" + v1);

    }
}
