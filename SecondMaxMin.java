import java.util.*;

public class SecondMaxMin {

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
        int max = arr[0];
        int sec = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                sec = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > sec) {
                sec = arr[i];
            }
        }
        System.out.println(sec + " is the second largest maximum element in the array");
    }

    static void Min(int[] arr) {
        int min = arr[0];
        int ssm = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                ssm = min;
                min = arr[i];
            } else if (arr[i] != min && arr[i] < ssm) {
                ssm = arr[i];
            }
        }
        System.out.println(ssm + " is the second largest element in the array");
    }
}
