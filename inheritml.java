// multilevel inherit...
// one super  class and sub class of subclass ..................n

class A {

    void add() {
        int x = 10;
        int y = 20;
        System.out.println("add of " + x + " + " + y + (x + y));
    }
}

class B extends A {
    int x = 50;
    int y = 20;

    void sub() {
        System.out.println("subtract " + x + " - " + y + (x - y));
    }
}

class C extends B {
    int x = 50;
    int y = 10;

    void divide() {
        System.out.println("divide of " + x + " / " + y + (x / y));
    }
}

public class inheritml {
    public static void main(String args[]) {
        C obj = new C();
        obj.add();
        obj.sub();
        obj.divide();
    }
}
