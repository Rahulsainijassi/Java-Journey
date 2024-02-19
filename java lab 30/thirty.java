import java.io.*;

public class thirty {
    public static void main(String[] args) {
        FileOutputStream out;
        PrintStream p;
        try{
            out=new FileOutputStream("myfile.txt");
            p=new PrintStream(out);
            p.close();
        }
        catch (Exception e){
            System.out.println("Error writion to file");
        }
    }
}
