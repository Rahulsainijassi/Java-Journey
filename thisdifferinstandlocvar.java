//this keyword remove compiler confusion betwen instance variable and loca var
// if different varibale then u can access without this keyword
public class thisdifferinstandlocvar {
    int x;

    thisdifferinstandlocvar(int x) {
        this.x = x;// here confused ,and show return 0 not 100
        // this.x = x; //now show() return 100
    }

    void show() {
        System.out.println(x);
    }

    public static void main(String args[]) {
        thisdifferinstandlocvar obj = new thisdifferinstandlocvar(100);
        obj.show();
    }
}
