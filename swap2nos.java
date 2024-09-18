import java.util.*;

// without using a third variable
public class swap2nos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two values -> ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping -> ");
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
    }
}
