import java.util.*;

public class kthlargestSmallest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayIn(arr);
        ArrayOut(arr);
        Max(arr);
        Min(arr);
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

    static void Max(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter which largest element you want to find -> ");
        int k = in.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println(arr[i] + " is the " + k + "th largest element in the array");
            }
        }
    }

    static void Min(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter which smallest element you want to find -> ");
        int k = in.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println(arr[i] + " is the " + k + "th smallest element in the array");
            }
        }
    }
}
