import java.util.*;

public class forl2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter upto where you want to print -> ");
        int n = in.nextInt();
        int i;
        System.out.println("The values are -> ");
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
