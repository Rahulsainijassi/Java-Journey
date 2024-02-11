
// import java.io.FileWriter;
import java.io.*; // all classes from.....

public class fileWtite {
    public static void main(String args[]) {
        try {
            FileWriter objfw = new FileWriter("C:\\Users\\Rahul\\Desktop\\newfile.txt");
            try {
                objfw.write("yes this the words who wroten by java file ");
            }

            finally {
                objfw.close();
            }
            System.out.println("successfully wroten in file ok just chill.........");
        } catch (IOException i) {
            System.out.println(i);
        }

    }
}
