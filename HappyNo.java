import java.util.*;

public class HappyNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any value -> ");
        int n = in.nextInt();
        HappyNo obj = new HappyNo();
        boolean ans = obj.isHappy(n);
        if (ans == true) {
            System.out.println(n + " is a Happy number");
        } else {
            System.out.println(n + " is not a Happy number");
        }
    }

    boolean isHappy(int n) {
        int ans = n;
        while (ans != 1 && ans != 4) {
            ans = SquareSum(ans);
        }
        if (ans == 1) {
            return true;
        } else {
            return false;
        }
    }

    static int SquareSum(int n) {
        int rem, sum = 0;
        while (n != 0) {
            rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}
