package Sorting;

import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr; // declaration
        arr = new int[n]; // definition
        ArrayIn(arr);
        ArrayOut(arr);
        Insertion(arr);
        System.out.println("After applying Insertion Sort :-");
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

    static void Insertion(int[] arr) {
        int temp, index;
        for (int i = 0; i < arr.length; i++) {
            index = i;
            temp = arr[i];
            while (index > 0 && arr[index - 1] > temp) {
                arr[index] = arr[index - 1];
                index = index - 1;
            }
            arr[index] = temp;
        }
    }
}
