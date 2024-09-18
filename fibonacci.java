import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of terms -> ");
        int a = in.nextInt();
        fibonacci obj = new fibonacci();
        obj.printFib(a);
    }

    void printFib(int n) {
        int a = 0, b = 1;
        int r;
        System.out.println("Fibonacci series having " + n + " terms :- ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            r = a + b;
            a = b;
            b = r;
        }
    }
}
