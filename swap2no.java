import java.util.*;

// using a third variable
public class swap2no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two values -> ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping -> ");
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
    }
}
