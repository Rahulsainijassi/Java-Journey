//defaut constracor ->without parameter constractor called default constractor
class A {
    String name;
    int n;
    boolean tf;

    // every program have defaut constractor and auto set values in instance
    // variable ⬆ like taht String = unll, int= 0, boolean =false etc
    A() {
        name = "king";
        n=40;
    }

    void info() {
        System.out.println(name + " " + n + " " + tf);
    }
}

public class consdefault {
    public static void main(String args[]) {
        A obj = new A();
        obj.info();
    }
}
