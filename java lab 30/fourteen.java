class abc {
    abc() {
        System.out.println("Default constructor");

    }

    abc(int a) {
        System.out.println("one perameterize constructor " + a);
    }

    abc(int a, int b) {
        System.out.println("multi/ two perameterized constructor " + a + "   " + b);
    }
}

class fourteen {
    public static void main(String[] args) {
        abc obj = new abc();// default const..
        abc obj2 = new abc(45);// prerametrize const
        abc obj3 = new abc(34, 56); // multi pera const

    }
}