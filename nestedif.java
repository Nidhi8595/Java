import java.util.*;

public class nestedif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age ->");
        int a = in.nextInt();
        if (a > 18) {
            System.out.println("You are able to vote");
            if (a > 35) {
                System.out.println("You are able to participate in election for President");
            }
        } else {
            System.out.println("You are not able to vote");
        }
    }
}
