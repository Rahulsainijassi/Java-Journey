// import java.lang.*; //by default if you not import 
//1. by extending Thread class 
class threadsjava extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {

                System.out.println("thread");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) throws Exception {
        threadsjava obj = new threadsjava();
        obj.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main");
            Thread.sleep(100);
        }
    }
}