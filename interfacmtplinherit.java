// java have not multiple inhertance 
// here is interface for do this work (interface implements)
// remember that in a interface methods became auotmatic abstract.... 
interface A {
    void showa();// public + abstract
}

interface B {
    void showb();// public + abstract
}

class C implements A, B {
    public void showa() {
        System.out.println("im interface a showa() : ");
    }

    public void showb() {
        System.out.println("im interface B showb() : ");
    }

    void showc() {
        System.out.println("im interface C showc() : ");
    }
}

public class interfacmtplinherit {
    public static void main(String args[]) {
        C objC = new C();
        objC.showa();
        objC.showb();
        objC.showc();
    }

}
