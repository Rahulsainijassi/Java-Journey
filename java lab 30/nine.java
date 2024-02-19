// inner class == class in class like nested
class abc {
    int x = 5;

    class inner {
        void inshow() {
            System.out.println("im inner class" + x);
        }
    }

    void show() {
        System.out.println("im outer class");
        inner obj = new inner();
        obj.inshow();// inner class obj
    }
}

public class nine {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.show();
    }
}
