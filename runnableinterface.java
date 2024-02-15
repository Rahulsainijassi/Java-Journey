class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("form runnable");
        }
    }
}

class runnableinterface {
    public static void main(String args[]) {
        A obj = new A();
        Thread objt = new Thread(obj);
        objt.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("form main");
        }
    }
}