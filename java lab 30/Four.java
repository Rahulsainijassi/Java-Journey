// Input through DataInputStream (DIS)
import java.io.*;

class Four {
    public static void main(String args[]) throws IOException {
        int a, b, c;
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("input no");
        a = Integer.parseInt(dis.readLine());
        b = Integer.parseInt(dis.readLine());
        c = a + b;
        System.out.println(c);

    }
}