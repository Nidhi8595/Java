import java.util.*;

//  printing the factorial of a number
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value -> ");
        int a = in.nextInt();
        int f = 1;
        for (int i = a; i >= 1; i--) {
            f = f * i;
        }
        System.out.println("Factorial -> " + f);
    }
}
