// copy constructor
class A {
    int age;
    String name;

    A(int x, String y) {
        age = x;
        name = y;
        System.out.println(age + " and " + name);
    }

    A(A ref) {//referance of first constructor //copy data form...
        age = ref.age;
        name = ref.name;
        System.out.println(age + " and " + name);
    }
}

public class conscopy {
    public static void main(String args[]) {
        A obj = new A(50, "RAM");
        A obj2 = new A(obj);
    }
}