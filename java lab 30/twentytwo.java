//multi level inheritance
class a {
    void showa() {
        System.out.println("base/super/parent  class a");
    }
}

class b extends a {
    void showb() {
        System.out.println("derived/child/sub class b");
    }
}

class c extends b {
    void showc() {
        showa();
        showb();
        System.out.println("sub class c");
    }
}

public class twentytwo {
    public static void main(String[] args) {
        c obj = new c();
        obj.showc();
    }
}
