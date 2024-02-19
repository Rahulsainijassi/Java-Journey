
import java.io.*;

public class twentynine {
public static void main(String[] args) throws Exception {
    FileOutputStream out =new FileOutputStream("sit.txt");
    PrintStream P=new PrintStream(out);
    P.println("shankara");
    P.close();
    FileInputStream fis=new FileInputStream("sit.txt");
    DataInputStream dis=new DataInputStream(fis);
    System.out.println("***here is file content****");
    while(dis.available()!=0){
        System.out.println(dis.readLine());
    }
    dis.close();
}
}
// import java.io.*;
