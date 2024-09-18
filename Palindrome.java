import java.util.*;

public class Palindrome {
    static int rev = 0, rem;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value -> ");
        int a = in.nextInt();
        Palindrome obj = new Palindrome();
        obj.palin(a);
    }

    int reverse(int n) {
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    void palin(int n) {
        int ans = reverse(n);
        if (n == ans) {
            System.out.println(n + " is a Palindrome number");
        } else {
            System.out.println(n + " is not a Palindrome number");
        }
    }
}
