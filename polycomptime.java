// polymorphisam - 2 types
// 1. comile time / static / early bynding polymorphisam (heppens by overlodaing means same name function/method and differ perameters)
// 2. run time /dynamic / late bynding poly....

class polycomptime {

    void add() {
        int x = 10;
        int y = 20;
        int c = x + y;
        System.out.println("total = " + c);
    }

    // without int (return type )
    // void add(int n, int m) {
    // int c = n + m;
    // System.out.println("total " + c);
    // }

    // if we use int return type for return/ is possible here everything possible 🎯
    int add(int n, int m) {
        int c = n + m;
        return c;
    }

    void add(int n, double m) {
        double c = n + m;
        System.out.println("toatl " + c);
    }

    public static void main(String args[]) {

        polycomptime obj = new polycomptime();
        obj.add();// compiler automatic understanding by perameter & arguments which function
                  // (overloaded) you are calling
        // obj.add(30, 50); // return type is void
        int returnvale = obj.add(30, 50);// taking return value in a variable
        System.out.println("toatl= " +returnvale);
        obj.add(10, 50.50);
    }
}