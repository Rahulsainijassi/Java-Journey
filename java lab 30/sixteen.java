// import java.io.*;
import java.util.*;

public class sixteen {
    public static void main(String[] args) {
        int i, j, r, c, matrix[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("how many rows");
        r = sc.nextInt();
        System.out.println("how many cols");
        c = sc.nextInt();
        matrix = new int[r][c];
        System.out.println("input element in matrix");

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }

        System.out.println("show all elements");

        for (i = 0; i < r; i++) {

            for (j = 0; j < c; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
