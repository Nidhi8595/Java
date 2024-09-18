// using Collection

import java.util.*;

public class firstDuplicate2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayIn(arr);
        ArrayOut(arr);
        Duplicate(arr);
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

    static void Duplicate(int[] arr) {
        int temp = -1;
        HashSet<Integer> h = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (h.contains(arr[i])) {
                temp = i;
            } else {
                h.add(arr[i]);
            }
        }
        if (temp != -1) {
            System.out.println("The first duplicate element in the array is -> " + arr[temp]);
        }
    }
}
