// Input through command line
public class Two {
    public static void main(String[] args) {
        String str;
        int n, i;
        n = args.length;
        for (i = 0; i < n; i++) {
            str = args[i];
            System.out.println(i + " " + str);
        }
    }
}
