import java.util.Scanner;

public class Findmax {
    public static void main(String king[]) {
        int x, y, z;
        System.out.println("Enter 3 number for find max");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        x = s.nextInt();
        System.out.println("Enter Second number");
        y = s.nextInt();
        System.out.println("Enter Third number");
        z = s.nextInt();

        if (x > y) {
            if (x > z) {
                System.out.println(x + " is max ");
            } else {
                System.out.println(z + " is max ");
            }
        } else if (y > z) {
            System.out.println(y + " is max ");
        } else {
            System.out.println(z + " is max ");
        }

    }
}
