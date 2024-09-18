
import java.util.*;

public class prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number -> ");
        int no = in.nextInt();
        prime obj = new prime();
        obj.checkPrime(no);
    }

    void checkPrime(int a) {
        int n = 0;
        for (int i = 2; i <= a - 1; i++) {
            if (a % i == 0) {
                n = n + 1;
            }
        }
        if (n == 0) {
            System.out.println(a + " is a Prime number");
        } else {
            System.out.println(a + " is not a Prime number");
        }
    }
}
