// default constractro -> non perameterize constractor  supper keyword 😎😎😎

class A {
    A(int x) {
        System.out.println("im A constractor and this is value of x = " + x);
    }
}

class B extends A {
    B() {
        // super();// automatic super(); seted her if we not write by default super is
        // seted here
        // but if you passed parameter in constractro then naccessary to define super
        // like ⬇
        super(5);// A constractro is peramiterize constractor so pass arguments in super for.........
        System.out.println("im class b sub class");
    }
}

public class superonconstractor {
    public static void main(String[] args) {
        B obj = new B(); // auto.. called because constractor..............
    }
}
