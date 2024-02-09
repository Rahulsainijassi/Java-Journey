//perameterrized construcor
// we can use more than one constrctors in a class
class B {
    int x, y;

    B(int a, int b) { //first constractor 
        x = a;
        y = b;
    }

    B(String n) { //second constractor note pareameter difference in necessary otehrwise will be overriding 
        System.out.println(n + " this is form second constructor");
    }

    void show() {
        System.out.println(x + " " + y);
    }
}

public class consperamiterize {
    public static void main(String args[]) {
        B obj = new B(45, 55);
        B obj2 = new B("king");
        obj.show();
    }
}
