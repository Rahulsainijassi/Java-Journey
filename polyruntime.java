// runtime polymorphisam not posible wihtout inheritance / and this achived by m overriding (means same function with same perameters)

class A {
    void sum() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("super class A ->sum of a & b is : " + c);
    }
}

class B extends A {
    @Override
    void sum() {
        super.sum();// if want call super class same name function also with.....
        int a = 30;
        int b = 40;
        int c = a + b;
        System.out.println("sub class B -> sum of a & b : " + c);
    }
}

public class polyruntime {
    public static void main(String args[]) {
        B objofB = new B();
        objofB.sum();// auto matically call sub class function if super class function also need then
                     // both will call(by super.sum(); in same funcion)
    }
}
