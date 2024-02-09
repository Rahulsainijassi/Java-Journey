import java.util.Scanner;

public class Addbyinput {
    public static void main(String args[]) {
        int x, y, z;
        System.out.println("Enter numbers for add ");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        System.out.println("this is yoru number " + x + " + " + y + " + " + z);
        System.out.println("Total = " + (x + y + z));
    }
}