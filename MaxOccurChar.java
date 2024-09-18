// finding the maximum occurring character in string

import java.util.Scanner;

public class MaxOccurChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string -> ");
        String a = in.nextLine();

        int arr[] = new int[127];

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)] = arr[a.charAt(i)] + 1;
        }

        int max = 1;
        char c = ' ';

        for (int i = 0; i < a.length(); i++) {
            if (max < arr[a.charAt(i)]) {
                max = arr[a.charAt(i)];
                c = a.charAt(i);
            }
        }

        System.out.println("The maximum occurring character in " + a + " is -> " + c);
    }
}
