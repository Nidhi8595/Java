import java.util.*;

//  printing the table of a given value
public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value -> ");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " -> " + n * i);
        }
    }
}
