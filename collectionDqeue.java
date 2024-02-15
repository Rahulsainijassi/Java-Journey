
//first in fist out fifo 
import java.util.ArrayDeque;
import java.util.Queue;

public class collectionDqeue {
    public static void main(String args[]) {
        ArrayDeque<String> obj = new ArrayDeque<>();
        obj.add("first");
        obj.add("second");
        obj.add("third");
        obj.add("fourth");
        System.out.println(obj);
        obj.remove();// will remove first because fifi first in first out
        System.out.println(obj);
    }

}
