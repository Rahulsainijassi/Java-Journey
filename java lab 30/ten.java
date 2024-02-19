// passing object
class abc {
    int num;

    void inpt(int x) {
        num = x;
    }

    void inpt2(abc ob) {
        num = 2 * ob.num;
    }

    void show() {
        System.out.println("num " + num);
    }
}

public class ten {
    public static void main(String[] args) {
        abc obj = new abc();
        abc obj2 = new abc();
        obj.inpt(10);
        obj2.inpt2(obj);
        obj.show();
        obj2.show();

    }
}
