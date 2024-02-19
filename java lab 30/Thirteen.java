//default constructor (no peramiters) constructor 
// void keyword used constructor

class abc {
    abc() {
        System.out.println("Default constructor");
    }

    void abc() {
        System.out.println("Void keyword use constructor");
    }
}

public class Thirteen {
    public static void main(String[] args) {
        abc obj = new abc();//default const..
        obj.abc();//void keyword used cons...
    }
}
