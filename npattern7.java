import java.util.*;

public class npattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows -> ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int c = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c = c + n - j;
            }
            System.out.println("\n");
        }
    }
}
