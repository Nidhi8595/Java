// Insert an element into Array at given Position

import java.util.*;

public class InsertAtPos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayIn(arr);
        ArrayOut(n - 1, arr);
        Insert(n, arr);
        System.out.println("After inserting the given value :- ");
        ArrayOut(n, arr);
    }

    static void ArrayIn(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements -> ");
        for (int i = 0; i < arr.length - 1; i++) // initialization
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

    static void Insert(int n, int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value & the Position at which to be inserted -> ");
        int k = in.nextInt();
        int p = in.nextInt();

        for (int i = n - 1; i >= p; i--) {
            arr[i] = arr[i - 1];
        }

        arr[p - 1] = k;
    }

}
