public class recursion {
    public static void main(String args[]) {
        // // factorial by recursion
        // int factorial = fact(5);
        // System.out.println(factorial);
        // }

        // static int fact(int x) {
        // if (x >= 1) {
        // return x * (fact(x - 1));
        // }
        // return 1;

        // print n number using recursion
        npirnter(100);
    }

    static void npirnter(int x) {
        if (0 < x) {
            npirnter(x - 1);
            System.out.println(x);
        }
    }

}
