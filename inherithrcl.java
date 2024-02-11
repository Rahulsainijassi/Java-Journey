// hararichele inheritece
public class inherithrcl {
    public static void main(String args[]) {
        System.out.println("by b class");
        B objforb = new B();
        objforb.show();
        objforb.show2();
        // objforb.show3(); //can't access -> galat baat 😁
        System.out.println("by c class ");
        C objforc = new C();
        objforc.show();
        objforc.show3();
    }
}

class A {
    void show() {
        System.out.println("yes im show form super class A : ");
    }
}

class B extends A {
    void show2() {
        System.out.println("i'm show2 form sub class of A  class B : ");
    }
}

class C extends A {
    void show3() {
        System.out.println("i'm show3 form sub class of A class C");
    }
}
