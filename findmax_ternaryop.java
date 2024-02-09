import java.util.Scanner;

public class findmax_ternaryop {
    public static void main(String args[]) {
        System.out.println("enter 3 number for compare and find max");
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number ");
        int x = s.nextInt();
        System.out.println("enter second number ");
        int y = s.nextInt();
        System.out.println("enter second number ");
        int z = s.nextInt();
        System.out.println((x > y) ? (x > z ? x + " is max" : z + " is max") : (y > z ? y + " is max" : z + " is max"));
    }
}
