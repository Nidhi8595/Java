import java.util.*;

public class reverse {
    static int rev = 0, rem;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value -> ");
        int a = in.nextInt();
        reverse obj = new reverse();
        int ans = obj.rev(a);
        System.out.println("Reverse of " + a + " is -> " + ans);
    }

    int rev(int n) {
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
}