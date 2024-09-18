package Sorting;

import java.util.Scanner;

public class MergeSort {

    static int[] tempMerge;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr; // declaration
        arr = new int[n]; // definition
        ArrayIn(arr);
        ArrayOut(arr);
        MergeS(arr);
        System.out.println("After applying Merge Sort :-");
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

    static void MergeS(int[] arr) {
        int length = arr.length;
        tempMerge = new int[length];
        divide(arr, 0, length - 1);
    }

    static void divide(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            divide(arr, low, mid); // sort left side
            divide(arr, mid + 1, high); // sort right side
            Merge(arr, low, mid, high);
        }
    }

    static void Merge(int[] arr, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            tempMerge[i] = arr[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (tempMerge[i] <= tempMerge[j]) {
                arr[k] = tempMerge[i];
                i++;
            } else {
                arr[k] = tempMerge[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = tempMerge[i];
            k++;
            i++;
        }

        while (j <= high) {
            arr[k] = tempMerge[j];
            k++;
            j++;
        }
    }
}
