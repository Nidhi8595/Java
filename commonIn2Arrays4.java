// Better approach
// avoids repeated values

// suppose the same element is present more than once in the same array
// then also the add() will not insert it into the HashSet and 
// consider it to be a common element
// to avoid this, we will use two separate HashSets

import java.util.*;

public class commonIn2Arrays4 {
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
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        for (int i : arr1) {
            h1.add(i);
        }
        for (int i : arr2) {
            h2.add(i);
        }

        for (int i : h2) {
            boolean ans = h1.add(i); // insert values from HashSet containing
            // unique values from arr2 into first HashSet
            if (ans == false) {
                System.out.print(i + " ");
            }
        }
    }
}
