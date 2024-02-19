// inheritance
class a {
    void showa() {
        System.out.println("form class A");
    }
}

class b extends a {
    void showb() {
        System.out.println("form class B");
    }
}

class twentyone {
    public static void main(String[] args) {
        b obj = new b();
        obj.showa();
        obj.showb();
    }
}