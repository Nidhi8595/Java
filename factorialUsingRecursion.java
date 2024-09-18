import java.util.*;

public class factorialUsingRecursion {
    static int f = 1; // accessible for every method

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value -> ");
        int a = in.nextInt();
        factorialUsingRecursion obj = new factorialUsingRecursion();
        int ans = obj.factr(a);
        System.out.println("Factorial of " + a + " is -> " + ans);
    }

    int factr(int n) {
        if (n > 1) {
            f = f * n;
            factr(n - 1);
        }
        return f;
    }
}
