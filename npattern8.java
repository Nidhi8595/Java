import java.util.*;

public class npattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows -> ");
        int n = in.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= 3; j++) {
                    c = c + 1;
                    System.out.print(c + " ");
                }
            } else {
                int t = c + 1;
                for (int j = c + 3; j >= t; j--) {
                    c = c + 1;
                    System.out.print(j + " ");
                }
            }
            System.out.println("\n");
        }
    }
}
