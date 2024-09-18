// using Map

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurChar2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string -> ");
        String a = in.nextLine();

        HashMap<Character, Integer> h = new HashMap<>();

        char[] c = a.toCharArray();
        for (char ch : c) {

            if (h.containsKey(ch)) {

                h.put(ch, h.get(ch) + 1);
            } else {

                h.put(ch, 1);
            }
        }

        int max = 0;
        char chr = ' ';

        for (Map.Entry<Character, Integer> m : h.entrySet()) {

            if (max < m.getValue()) {

                max = m.getValue();
                chr = m.getKey();
            }
        }

        System.out.println("The maximum occurring character in " + a + " is -> " + chr);
    }
}
