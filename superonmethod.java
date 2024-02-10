// same name method access by super (inheritance is neccessary)

class A {
    void show() {
        System.out.println("I'm presenting class A it meanse parent/super class ");
    }
}

class B extends A {
    void show() {
        super.show();
        System.out.println("im presenting class B is means sub class ");
    }
}

public class superonmethod {
    public static void main(String args[]) {
        B obj = new B();
        obj.show();
    }
}
