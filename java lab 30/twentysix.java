//six=Join
import java.lang.*;
public class twentysix implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " is alive " + t.isAlive());
    }

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new twentysix());
        t.start();
        t.join(100, 1000);
        System.out.println(t.getName() + " is alive " + t.isAlive());
    }
}
