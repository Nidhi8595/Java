// Fnding the missing Element in a Strict Sequential array
//using formula

import java.util.*;

public class MissingNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayIn(arr);
        ArrayOut(arr);
        Missing(arr);
    }

    static void ArrayIn(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements(integers only from 1 till size) -> ");
        for (int i = 0; i < arr.length - 1; i++) // initialization
        {
            arr[i] = in.nextInt();
        }
    }

    static void ArrayOut(int[] arr) { // Retrieval
        System.out.println("Array elements are -> ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void Missing(int[] arr) {
        int s = arr.length;
        int rsum = 0;
        int sum = s * (s + 1) / 2;
        for (int j = 0; j < s - 1; j++) {
            rsum = rsum + arr[j];
        }
        int m = sum - rsum;
        System.out.println("The missing number in the array is -> " + m);
    }
}
