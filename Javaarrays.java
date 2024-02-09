import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Javaarrays {
    public static void main(String args[]) {
        // //different wasy of array
        // // 1D array with for each
        // int arr[] = { 45, 34, 23, 5, 36, 74, 34, 6, 3 }; //way first
        // System.out.println("print array elements");
        // for (int x : arr) {
        // System.out.print(x + " ");
        // }

        // take input in array, by user
        // Scanner s = new Scanner(System.in);
        // int a[] = new int[5];
        // for (int i = 0; i < 5; i++) {
        // System.out.println("enter array element no " + (i + 1));
        // a[i] = s.nextInt();
        // }
        // System.out.println("your array is");
        // for (int x : a) {
        // System.out.print(" " + x);
        // }

        // //2D array
        // int arr[][] = { { 24, 34, 26, 17 }, { 23, 54, 76, 78 } };
        // System.out.println("print array");
        // // here by for-each loop we can't access full 2D array but we can access
        // parts like {24,34,26,17}...
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // take input by user in 2D array according users choice
        // int r, c;
        // Scanner s = new Scanner(System.in);
        // System.out.println("enter number of rows");
        // r = s.nextInt();
        // System.out.println("enter number of colums");
        // c = s.nextInt();

        // int arr[][] = new int[r][c];
        // System.out.println("enter array elements");
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // System.out.println("enter array elements on location " + i + j);// here I and
        // J will not add if you want
        // // add do this f(i+j)
        // arr[i][j] = s.nextInt();
        // }
        // }
        // System.out.println("print array");
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // shorting array predefined functuion
        // Arrays.sort(array_name);

        int arr[] = { 34, 65, 23, 65, 22, 4, 0, 43, 2, 1 };
        System.out.println("before sort array");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // sorted
        Arrays.sort(arr);
        System.out.println("\n after sort array");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
