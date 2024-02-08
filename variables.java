class variables {
    int x = 24;// instance
    static int st = 34;// static var no need object

    public static void main(String king[]) {
        int loc = 33;// local variable
        System.out.println(loc);
        System.out.println(st);

        // obj for access instance,variable x
        variables obj = new variables();
        System.out.println(obj.x);
    }
}