// Delete an element from Array

import java.util.*;

public class DeleteFromArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayIn(arr);
        ArrayOut(n, arr);
        Delete(n, arr);
        System.out.println("\nAfter Deleting the given value :- ");
        ArrayOut(n - 1, arr);
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

    static void Delete(int n, int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value to be deleted -> ");
        int k = in.nextInt();
        int cnt = 0; // in case the element is not present in array

        for (int i = 0; i < n; i++) {
            if (k == arr[i]) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                cnt += 1;
                break;
            }
        }

        if (cnt == 0) {
            System.out.println("\nElement not Present in the Array");
        } else {
            System.out.println("\nElement Deleted");
        }
    }

}
