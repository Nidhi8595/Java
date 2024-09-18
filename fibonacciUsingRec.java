import java.util.*;

public class fibonacciUsingRec {
    static int a = 0, b = 1, r;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of terms -> ");
        int a = in.nextInt();
        fibonacciUsingRec obj = new fibonacciUsingRec();
        System.out.println("Fibonacci series having " + a + " terms :- ");
        obj.printFib(a);
    }

    void printFib(int n) {
        if (n >= 1) {
            System.out.print(a + " ");
            r = a + b;
            a = b;
            b = r;
            printFib(n - 1);
        }
    }
}
