
// input through Scanner class
import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sr.nextInt();
        System.out.println("Enter Second number");
        b = sr.nextInt();
        c = a + b;
        System.out.println("a+b = " + c);
    }
}
