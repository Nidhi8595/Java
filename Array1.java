
// 1D ARRAYS
import java.util.*;

public class Array1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr; // declaration
        arr = new int[5]; // definition
        ArrayIn(arr);
        ArrayOut(arr);

        String[] arr2 = new String[] { "Black", "Blue", "Yellow", "White", "Pink" };
        ArrayOut2(arr2);
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

    static void ArrayOut2(String[] arr) { // Retrieval
        System.out.println("Array elements are -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
