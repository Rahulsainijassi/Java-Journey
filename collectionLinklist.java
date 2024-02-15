import java.util.LinkedList;

public class collectionLinklist {
    public static void main(String args[]) {
        LinkedList <String> obj = new LinkedList<>();
        obj.add("first");
        obj.add("second");
        obj.add("third");
        System.out.println(obj);
        for (String str : obj) {
            System.out.print(str + " ");
        }
        System.out.println("");
        obj.addLast("lastvala");// add in last
        obj.addFirst("Firstadded");// add at first
        System.out.println(obj);

        obj.add("normal_add");// automatic will be add in last
        System.out.println(obj);

        // accodrgin choice add
        obj.add(2, "choice_added");
        System.out.println(obj);
        obj.remove();// by default first elem remove
        System.out.println(obj);
        obj.remove(2);// according index remove
        System.out.println(obj);
        obj.removeLast();// remove last
        System.out.println(obj);

        obj.clear();
        System.out.println(obj);
    }
}
