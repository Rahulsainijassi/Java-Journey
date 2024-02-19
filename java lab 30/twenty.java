abstract class a {
    abstract void show();
}

class b extends a {
    void show() {
        System.out.println("from Class B");
    }
}

public class twenty {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
    }
}
