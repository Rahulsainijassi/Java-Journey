//incremental operator
public class Five {
    public static void main(String args[]) {
        int x, y, z;
        x = 10;
        System.out.println("x=10 = " + x);

        y = x++;
        System.out.println("y=x++ = " + y);
        System.out.println("x==" + x);

        z = ++x;
        System.out.println("z=++x = " + z);
        System.out.println("x= " + x);
    }
}
