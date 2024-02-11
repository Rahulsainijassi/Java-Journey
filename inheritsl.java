// single level inheritanse

class A {

    void add() {
        int x = 10;
        int y = 20;
        System.out.println("add of x+Y " + (x + y));
    }
}

class B extends A {
    int x = 50;
    int y = 20;

    void sub() {
        System.out.println("subtract x-y " + (x - y));
    }
}

public class inheritsl {
    public static void main(String args[]) {
        B obj = new B();
        obj.add();
        obj.sub();
    }
}
