
// 3D ARRAYS
import java.util.*;

public class Array3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows & columns & subcolumns -> ");
        int m = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();
        int[][][] arr; // declaration
        arr = new int[m][n][r]; // definition for matrix array

        ArrayIn(arr);
        ArrayOut(arr);

        System.out.println("Length of first subcolumn in arr -> " + arr[0][0].length);

        char[][][] arr2 = new char[][][] { { { 'A', 'B' }, { 'C', 'D' }, { 'E', 'F' } },
                { { 'G', 'H' }, { 'I', 'J' }, { 'K', 'L' } }, { { 'M', 'N' }, { 'O', 'P' }, { 'Q', 'R' } } };
        ArrayOut2(arr2);
    }

    static void ArrayIn(int[][][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements -> ");
        for (int i = 0; i < arr.length; i++) // initialization
        {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = in.nextInt();
                }
            }
        }
    }

    static void ArrayOut(int[][][] arr) { // Retrieval
        System.out.println("Array elements are -> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void ArrayOut2(char[][][] arr) { // Retrieval
        System.out.println("Array elements are -> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}