public class javaoops {
    String name = "ramu";
    int age = 45;

    void valk() {
        System.out.println(name + " can walk");
    }

    void talk() {
        System.out.println(name + " cant talk");
    }

    public static void main(String args[]) {
        javaoops obj = new javaoops();
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.valk();
        obj.talk();
    }
}
