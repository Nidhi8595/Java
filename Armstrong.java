import java.util.*;

public class Armstrong {
    static int rev = 0, rem;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value -> ");
        int a = in.nextInt();
        Armstrong obj = new Armstrong();
        obj.arm(a);
    }

    int reverse(int n, int l) {
        while (n != 0) {
            int m = 1;
            rem = n % 10;
            for (int i = 1; i <= l; i++) {
                m = m * rem;
            }
            rev = rev + m;
            n = n / 10;
        }
        return rev;
    }

    void arm(int n) {
        int a = n, l = 0;
        while (a != 0) {
            a = a / 10;
            l = l + 1; // length
        }
        int ans = reverse(n, l);
        if (ans == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
