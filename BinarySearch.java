import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayIn(arr);
        ArrayOut(arr);
        Binary(arr);
    }

    static void ArrayIn(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements -> ");
        for (int i = 0; i < arr.length; i++) // initialization
        {
            arr[i] = in.nextInt();
        }
    }

    static void ArrayIn2(String[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements -> ");
        for (int i = 0; i < arr.length; i++) // initialization
        {
            arr[i] = in.nextLine();
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

    static void Binary(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target -> ");
        int t = in.nextInt();

        int l = 0, h = arr.length - 1;
        int mid = (l + h) / 2;

        while (l <= h) {
            if (arr[mid] == t) {
                System.out.println(t + " is present at " + mid + " index in the given array");
                break;
            }

            else if (arr[mid] < t) {
                l = mid + 1;
            }

            else {
                h = mid - 1;
            }
            mid = (l + h) / 2;
        }
        if (l > h) {
            System.out.println(t + " is not present in the given array");
        }
    }
}