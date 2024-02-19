// import java.lang.*;
// seven = threaddemo2
class A extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("thread A: " + i);
        }
        System.out.println("exit thread A ");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 0; j < 3; j++) {
            System.out.println("thread B: " + j);
        }
        System.out.println("Exit thread B ");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 0; k < 3; k++) {
            System.out.println("thread C: " + k);
        }
        System.out.println("exit thread C");
    }
}

public class twentyseven {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.MAX_PRIORITY);
        threadC.setPriority(Thread.NORM_PRIORITY);

        System.out.println("thread A start");
        threadA.start();
        System.out.println("thread B start");
        threadB.start();
        System.out.println("thread C start");
        threadC.start();
    }
}
