import java.util.*;

public class reversestring {

    static String str = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string -> ");
        String a = in.nextLine();
        reversestring obj = new reversestring();
        String ans = obj.reverse(a);
        System.out.println("Reverse of " + a + " is -> " + ans);
    }

    String reverse(String s) {
        int l = s.length();
        for (int i = l - 1; i >= 0; i--) {
            str = str + s.charAt(i);
        }
        return str;
    }
}
