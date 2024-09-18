package Sorting;

import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr; // declaration
        arr = new int[n]; // definition
        ArrayIn(arr);
        ArrayOut(arr);
        Heap(arr);
        System.out.println("After applying Heap Sort :-");
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

    static void Heap(int[] arr) {
        int length = arr.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            Sort(arr, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            Sort(arr, i, 0);
        }
    }

    static void Sort(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1; // left child
        int r = 2 * i + 2; // right child
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            Sort(arr, n, largest);
        }

    }
}
