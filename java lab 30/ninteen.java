// supre keyword
class A {
    int a = 10;

    void show() {
        System.out.println("I'm form class A = " + a);
    }
}

class B extends A {
    int a = 20;

    void show() {
        super.a = 40;
        super.show();
        System.out.println("i'm from class B = " + a);

    }
}

public class ninteen {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();

    }

}
