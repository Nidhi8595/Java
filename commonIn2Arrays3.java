// Better approach
// using HashSet only
// does not avoid repeated values

import java.util.*;

public class commonIn2Arrays3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of first array -> ");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        ArrayIn(arr1);
        ArrayOut(arr1);

        System.out.println("Enter the size of second array -> ");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        ArrayIn(arr2);
        ArrayOut(arr2);
        Common(n1, arr1, n2, arr2);
    }

    static void ArrayIn(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements -> ");
        for (int i = 0; i < arr.length; i++) // initialization
        {
            arr[i] = in.nextInt();
        }
    }

    static void ArrayOut(int[] arr) { // Retrieval
        System.out.println("Array elements are -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void Common(int n1, int[] arr1, int n2, int[] arr2) {
        System.out.println("\nThe Common Elements in both arrays are :- ");
        HashSet<Integer> h = new HashSet<>();
        for (int i : arr1) {
            h.add(i);
        }
        for (int i : arr2) {
            boolean ans = h.add(i);
            // will ignore the elements that were already inserted from arr1
            // add() returns false in case any particular element is not added
            if (ans == false) {
                System.out.print(i + " ");
            }
        }
    }
}
