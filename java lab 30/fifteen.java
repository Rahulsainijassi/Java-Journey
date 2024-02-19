//array
// import java.io.*;
import java.util.*;

public class fifteen {
    public static void main(String[] args) {
        int i, n, num[];
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element");
        n = sc.nextInt();
        num = new int[n];
        System.out.println("input element in array");
        for (i = 0; i < n; i++) {
            num[i] = sc.nextInt();

        }
        System.out.println("elements of in array");
        for (i = 0; i < n; i++) {
            System.out.println(i + " index no = " + num[i]);
        }
    }
}
