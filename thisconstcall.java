// // we can access defaul constractro (non-perametrize const) in preametrize constractor by this();
// public class thisconstcall {
//     thisconstcall() {
//         System.out.println("im default constractor");
//     }

//     thisconstcall(int x) {
//         this();// default constractro by useing this keyword
//         System.out.println("im peramiterize constractor " + x);
//     }

//     public static void main(String args[]) {
//         thisconstcall obj = new thisconstcall(100);
//     }
// }

//we can access perametrized cosntractor in defaul const in same class

public class thisconstcall {
    thisconstcall() {
        this(40);// calling perameterized constructor
        System.out.println("im default/non pera constractor");

    }

    thisconstcall(int x) {
        System.out.println("im peramiterize constractor " + x);
    }

    public static void main(String args[]) {
        thisconstcall obj = new thisconstcall();
    }

}
