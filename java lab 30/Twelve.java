// constructor

class abc {
    int a;

    abc(int x) {
        a = x;
        System.out.println(" a = " + a);
    }

    abc(abc b) {
        // int c = b.a;
        System.out.println("c = " + b.a);
    }
}

public class Twelve {
    public static void main(String[] args) {
        abc obj = new abc(10);
        abc obj2 = new abc(obj);

    }
}
