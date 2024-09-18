import java.util.*;

public class Merge2Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of first array -> ");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        ArrayIn(arr1);
        ArrayOut(arr1);

        System.out.println("Enter the size of second array -> ");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        ArrayIn(arr2);
        ArrayOut(arr2);

        int[] arr3;
        arr3 = Merge(n1, arr1, n2, arr2);
        System.out.println("\nAfter Merging both the Arrays :- ");
        ArrayOut(arr3);
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

    static int[] Merge(int n1, int[] arr1, int n2, int[] arr2) {
        int[] arr3 = new int[n1 + n2];

        for (int i = 0; i < n1; i++) { // traversing arr1
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) { // traversing arr2
            arr3[n1 + i] = arr2[i];
        }

        return arr3;
    }

}
