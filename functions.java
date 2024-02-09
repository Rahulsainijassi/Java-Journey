public class functions {
    public static void main(String args[]) {

        // sum(45,55);
        
        functions obj = new functions(); // creating object no need for static function
        obj.sum(45, 5);

    }

    // static void sum(int x, int y) {
    void sum(int x, int y) {
        System.out.println(x + y);
    }
}
