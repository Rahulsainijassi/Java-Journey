
// here exception handling is necessary otherwise you get error
import java.io.*;

class fileHandlCreatef {
    public static void main(String args[]) throws IOException {// we can use try catch for this throws ex..
        File fobj = new File("C:\\Users\\Rahul\\Desktop\\bycreat.txt");

        // try {
            if (fobj.createNewFile()) {
                System.out.println("file created succeessfully");
            }

            else {
                System.out.println("file already exist");
            }
        // } catch (Exception e) {
        //     System.out.println("here wast exctptjls");
        // }

        System.out.println("prog flow mentained");
    }
}