// overloading

class add {
    int sum;
    int a, b;

    add(int x, int y) {
        a = x;
        b = y;
    }

    add(int z) {
        // a = b = z;
        a=z;
        b=z;//same here
    }

    void addition() {
        sum = a + b;
        System.out.println("sum= " + sum);
    }
}

public class seventeen {
    public static void main(String[] args) {
        add obj = new add(10, 20);// compiler understend by perameters
        add obj2 = new add(10);// compiler understend by perameters
        obj.addition();
        obj2.addition();
    }
}
