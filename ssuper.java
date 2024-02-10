//super keyword used for make difference between same named method, variable ,call constructor from super class /inherited class
// access same variabe using super /from super class
class A { // A is super class
    int x = 50;
}

class B extends A {
    int x = 20;

    void show() {
        System.out.println("without super keyword value of x  " + x);// own x =20
        System.out.println("using super keyword value of x " + super.x);// parent class x=50
    }
}

public class ssuper {
    public static void main(String args[]) {
        B obj = new B();
        obj.show();

    }
}