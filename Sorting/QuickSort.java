package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr; // declaration
        arr = new int[n]; // definition
        ArrayIn(arr);
        ArrayOut(arr);
        Quick(arr, 0, n - 1);
        System.out.println("After applying Quick Sort :-");
        ArrayOut(arr);
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

    static void Quick(int[] arr, int low, int high) {
        int k = Partition(arr, low, high);
        if (low < k - 1) {
            Quick(arr, low, k - 1);
        }

        if (k < high) {
            Quick(arr, k, high);
        }
    }

    static int Partition(int[] arr, int low, int high) {
        int length = arr.length;
        int pivot = arr[((low + high)) / 2];
        while (low <= high) {

            while (arr[low] < pivot) {
                low++;
            }

            while (arr[high] > pivot) {
                high--;
            }

            if (low <= high) {
                // swap
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }
}
