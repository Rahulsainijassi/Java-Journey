
// stack lifo last in first out 😁😂🤣
import java.util.Stack;

public class collectionStack {
    public static void main(String args[]) {
        Stack<String> obj = new Stack<>();
        // obj.add("firt");
        // obj.add("seocnd");
        // obj.add("third");
        // according stack we should chose push for add (also can use add )
        obj.push("firt");
        obj.push("seocnd");
        obj.push("four");
        obj.push("five");
        obj.push("six");
        System.out.println(obj);

        obj.push("pushelem");// added in last by push
        System.out.println(obj);
        obj.pop();// last out
        System.out.println(obj);
        obj.pop();// one more
        System.out.println(obj);
        obj.pop();// one more
        System.out.println(obj);
        obj.remove(1);// according choice
        System.out.println(obj);
    }
}
