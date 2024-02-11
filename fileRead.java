import java.io.*;

public class fileRead {

    public static void main(String args[]) throws IOException {
        FileReader frobj = new FileReader("C:\\Users\\Rahul\\Desktop\\newfile.txt");
        int i;
        while ((i = frobj.read()) != -1) {
            System.out.print((char) i );
        }
    }
}
