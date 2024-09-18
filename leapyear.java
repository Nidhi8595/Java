import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year ->");
        int a = in.nextInt();
        if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
