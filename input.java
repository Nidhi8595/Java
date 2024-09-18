
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter values ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = a + b;
        System.out.println("Sum->" + c);
    }
}
