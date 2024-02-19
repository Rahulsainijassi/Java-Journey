// import java.lang.*; //by default if you not import 
//1. by extending Thread class 
class twentyfive extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {

                System.out.println("thread");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) throws Exception {
        twentyfive obj = new twentyfive();
        obj.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("main");
            Thread.sleep(100);
        }
    }
}