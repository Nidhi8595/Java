package CollectionsFramework;

import java.util.Stack;

// child class of Vector
// LIFO
// implemented using Array, ArrayList, LL, Vector 
// index-based

public class stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        // push()
        s1.push(10);
        s1.push(30);
        s1.push(40);
        s1.push(70);
        s1.push(50);
        s1.push(80);
        System.out.println(s1);

        // pop() :- removes top element & returns it
        System.out.println("\n" + s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1);

        // peek()
        System.out.println("\n" + s1.peek()); // topmost element

        // search() :- returns index
        System.out.println("\n" + s1.search(30));
        System.out.println(s1.search(52)); // element not present hence -1

        // empty() :- for Stack
        System.out.println("\n" + s1.empty());

        // isEmpty() : - for vector
        System.out.println("\n" + s1.isEmpty());

    }
}
