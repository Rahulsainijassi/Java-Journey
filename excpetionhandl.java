// try catch exception handaling
public class excpetionhandl {
    public static void main(String args[]) {

        int x = 20;
        int y = 0;
        try {
            int z = x / y;
        } catch (ArithmeticException err) {
            System.out.println("you can't devide any nuber by zero");
        }
        System.out.println("yorr program finished now");
    }
}
