// import java.lang.*;
class xyz implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(" threadxyz: " + i);
        }
        System.out.println("End of threadxyz");
    }
}

public class twentyfour {
    public static void main(String[] args) {
        xyz runnableobj = new xyz();
        Thread threadobj = new Thread(runnableobj);
        threadobj.start();
        System.out.println("the end main thread");
    }
}
