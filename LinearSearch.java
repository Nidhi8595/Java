import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayIn(arr);
        ArrayOut(arr);
        Linear(arr);

        String[] arr2 = new String[n];
        ArrayIn2(arr2);
        ArrayOut2(arr2);
        Linear2(arr2);
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

    static void Linear(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target -> ");
        int t = in.nextInt();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                System.out.println(t + " is present at " + i + " index in the given array");
                cnt += 1;
            }
        }
        if (cnt == 0) {
            System.out.println(t + " is not present in the given array");
        }
    }

    static void Linear2(String[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target -> ");
        String s = in.nextLine();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                System.out.println(s + " is present at " + i + " index in the given array");
                cnt += 1;
            }
        }
        if (cnt == 0) {
            System.out.println(s + " is not present in the given array");
        }
    }
}