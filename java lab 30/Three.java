
// Input through InputStreamReader(isr)
import java.io.*;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;

public class Three {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // System.out.println("enter any thing as string");
        // String name = br.readLine();// a string
        // System.out.println(name);
        // take input int value
        System.out.println("first value");
        int x, y, z;
        x = Integer.parseInt(br.readLine());
        System.out.println("fist value");
        y = Integer.parseInt(br.readLine());
        z = x + y;
        System.out.println(z);

    }
}
