
// Use break statement in a Java program that searches for a particular element within an array. 
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        int n, searchnum, num[];
        boolean found = false;
        System.out.println("Enter number of elem in array");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        num = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elem on index " + i);
            num[i] = sr.nextInt();
        }

        System.out.println("show All array Elem.");

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("");
        System.out.println("Enter the elem for search form array");
        searchnum = sr.nextInt();
        for (int i = 0; i < n; i++) {
            if (num[i] == searchnum) {
                System.out.println("Elem " + num[i] + " found on index on " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Elem not found ");
        }

    }

}
