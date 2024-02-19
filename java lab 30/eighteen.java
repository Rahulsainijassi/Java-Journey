
//overriding
class A {
    void show() {
        System.out.println("im from class A");
    }
}

class B extends A {
    void show() {
        // super.show();// if you want access from class A
        System.out.println("im from class B");
    }
}

public class eighteen {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}
