// Better Approach
// using HashTable

import java.util.*;

public class duplicateArrayElements3 {

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
        Map<Integer, Integer> h = new HashMap<>();
        for (int i : arr) {
            Integer cnt = h.get(i);
            if (cnt == null)// value not already inserted into map
            {
                h.put(i, 1);// now it has a count 1 ,i.e. inserted once
            } else// already present
            {
                cnt += 1;
                h.put(i, cnt); // count increased
            }
        }
        Set<Map.Entry<Integer, Integer>> M = h.entrySet();
        for (Map.Entry<Integer, Integer> e : M) {
            if (e.getValue() > 1) {
                System.out.print(e.getKey() + " ");
            }
        }
    }
}
