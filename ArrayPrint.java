
// printing the elements of array in diff. ways

import java.util.*;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayOut(new int[] { 10, 20, 30, 40, 50 });
        ArrayOut2(new int[] { 60, 70, 80, 90 });
        ArrayOut3(new int[] { 10, 9, 8, 7, 6, 5 });
        ArrayOut4(new int[] { 2, 4, 6, 8, 10, 12 });
    }

    // 1 way
    static void ArrayOut(int[] arr) {
        System.out.println("Array elements are -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 2 way - using for each loop
    static void ArrayOut2(int[] arr) {
        System.out.println("Array elements are -> ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 3 way - using while loop
    static void ArrayOut3(int[] arr) {
        System.out.println("Array elements are -> ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    // 4 way
    static void ArrayOut4(int[] arr) {
        System.out.println("Array elements are -> ");
        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < arr.length);
        System.out.println();
    }
}
