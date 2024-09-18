// finally block is used with try-catch or just try
// may not be executed in case of error but always in case of an exception

import java.util.*;

public class Finally {
    public static void main(String[] args) {

        int a = 100, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) { // can be more than one
            System.out.println("Exception -> " + e);
        } finally { // only one
            System.out.println("finally block");
            // clean-up code
            // garbage collection
        }
    }
}
