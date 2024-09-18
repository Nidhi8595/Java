import java.util.Scanner;

public class dwhile1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter upto where you want to print -> ");
        int n = in.nextInt();
        int i = 1;
        System.out.println("The values are -> ");
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
