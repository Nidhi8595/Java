// Brute force 
// avoid repeated values

import java.util.*;

public class commonIn2Arrays2 {
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
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    h.add(arr1[i]);
                }
            }
        }
        for (int i : h) {
            System.out.print(i + " ");
        }
    }
}
