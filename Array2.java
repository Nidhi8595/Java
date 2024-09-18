
// 2D ARRAYS
import java.util.*;

public class Array2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows & elements in each row -> ");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr; // declaration
        arr = new int[m][n]; // definition for matrix array
        // definition for jagged array
        // arr = new int[2][];
        // arr[0]=new int[3];
        // arr[1]=new int[2];

        // arr[0][0] = 1;
        // arr[0][1] = 2; and so on.....

        ArrayIn(arr);
        ArrayOut(arr);

        System.out.println("Length of first row in arr -> " + arr[0].length);

        char[][] arr2 = new char[][] { { 'A', 'B' }, { 'C', 'D' }, { 'E', 'F' } };
        ArrayOut2(arr2);
    }

    static void ArrayIn(int[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements -> ");
        for (int i = 0; i < arr.length; i++) // initialization
        {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    static void ArrayOut(int[][] arr) { // Retrieval
        System.out.println("Array elements are -> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void ArrayOut2(char[][] arr) { // Retrieval
        System.out.println("Array elements are -> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}