import java.util.*;

public class commonIn3Arrays {

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

        System.out.println("Enter the size of third array -> ");
        int n3 = in.nextInt();
        int[] arr3 = new int[n3];
        ArrayIn(arr3);
        ArrayOut(arr3);
        Common(n1, arr1, n2, arr2, n3, arr3);
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

    static void Common(int n1, int[] arr1, int n2, int[] arr2, int n3, int[] arr3) {
        System.out.println("\nThe Common Elements in all arrays are :- ");
        ArrayList<Integer> Al = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                Al.add(arr1[i]);
                i++;
                j++;
                k++;
            }

            else if (arr1[i] < arr2[j]) {
                i++;
            }

            else if (arr2[j] < arr3[k]) {
                j++;
            }

            else {
                k++;
            }
        }

        for (int n : Al) {
            System.out.print(n + " ");
        }
    }
}
