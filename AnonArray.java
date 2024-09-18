//  Anonymous arrays 
// doesn't have a name
// used instanly after creation
// used only once
// can be multidimensional as well

// for example, passing any array type argument to a function without defining the array before

import java.util.*;

public class AnonArray {

    public static void main(String[] args) {
        ArrayOut(new char[] { 'A', 'B', 'C', 'D', 'E' });
        ArraySum(new int[] { 1, 2, 3, 4, 5 });
    }

    static void ArrayOut(char[] arr) { // Retrieval
        System.out.println("Array elements are -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void ArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Array elements is -> " + sum);
    }
}