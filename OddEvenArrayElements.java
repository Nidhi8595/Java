
import java.util.*;

public class OddEvenArrayElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayIn(arr);
        ArrayOut(arr);
        OddEven(arr);
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

    static void OddEven(int[] arr) {
        ArrayList<Integer> Al = new ArrayList<>();
        ArrayList<Integer> Al2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Al.add(arr[i]);
            } else {
                Al2.add(arr[i]);
            }
        }

        int sum1 = 0;
        System.out.println("\nEven elements in the array are :- ");
        for (int i : Al) {
            sum1 += i;
            System.out.print(i + " ");
        }
        System.out.println("\nTotal count of Even elements is -> " + Al.size());
        System.out.println("Sum of Even elements is -> " + sum1);

        int sum2 = 0;
        System.out.println("\nOdd elements in the array are :- ");
        for (int i : Al2) {
            sum2 += i;
            System.out.print(i + " ");
        }
        System.out.println("\nTotal count of Odd elements is -> " + Al2.size());
        System.out.println("Sum of Odd elements is -> " + sum2);
    }
}
