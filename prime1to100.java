import java.util.*;

public class prime1to100 {

    public static void main(String[] args) {
        int n = 0;
        for (int j = 1; j <= 100; j++) {
            for (int i = 2; i <= j - 1; i++) {
                if (j % i == 0) {
                    n = n + 1;
                }
            }
            if (n == 0) {
                System.out.println(j + " is a Prime number");
            } else {
                n = 0;
            }
        }
    }
}