import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter upto where you want to print -> ");
        int n = in.nextInt();
        int i = 1;
        System.out.println("The values are -> ");
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
