// Better Approach
// using HashSet

import java.util.*;

public class duplicateArrayElements2 {

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
        System.out.println("The duplicates in the array are -> ");
        Set<Integer> s = new HashSet<>();
        for (int i : arr) // add the values of array into the set
        {
            if (s.add(i) == false) { // value already present in Set
                System.out.print(i + " ");
            }
        }
    }
}
