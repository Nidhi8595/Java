// Removing repeated elements from the array
// works for Unsorted array as well
// using HashSet

import java.util.*;

public class RemoveDuplicates2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayIn(arr);

        ArrayOut(n, arr);

        int res = Remove(n, arr);
        System.out.println("\nAfter Deleting the duplicate values :- ");
        ArrayOut(res, arr);
    }

    static void ArrayIn(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements -> ");
        for (int i = 0; i < arr.length; i++) // initialization
        {
            arr[i] = in.nextInt();
        }
    }

    static void ArrayOut(int n, int[] arr) { // Retrieval
        System.out.println("Array elements are -> ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int Remove(int n, int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < n; i++) {
            h.add(arr[i]);
        }

        int size = h.size();
        int i = 0;
        for (int j : h) {
            while (i < size) {
                arr[i] = j;
                i++;
                j++;
            }
        }
        return size;
    }
}
