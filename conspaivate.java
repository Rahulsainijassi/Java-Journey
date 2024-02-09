// private constructor can make obj in same class can't out of class another class

class A {
    int age;
    String name;

    private A() {
        age = 34;
        name = "king";
        System.out.println(age + " " + name);
    }

    static void show() {
        System.out.println("im different function");
    }
    // public static void main(String args[]) {
    // A obj = new A();
    // }
}

public class conspaivate {
    public static void main(String args[]) {
        // A obj = new A();
        A.show(); // static can access without obj by class name ok..........
    }
}
