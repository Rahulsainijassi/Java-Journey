
// collection - it means set of pre-defined classes and interfaces for save time of programer (like dsa oprtions array insersion delition shorting etc.)
// import java.util.ArrayList;
// import java.util.Stack;
// import java.util.LinkedList;//etc

import java.util.*;// i'm using * for access all classes from java.util package

public class collectionsarray {
    public static void main(String args[]) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Zero");
        obj.add("first");
        obj.add("second");
        obj.add("thrid");
        obj.add("fourth");
        obj.add("fifth");
        obj.add("sixth");// add elem
        System.out.println(obj);// print obj
        System.out.println(obj.get(4));// a specific elem traverce/ search/ fach
        for (String str : obj) {
            System.out.print(str + " ");
        }
        System.out.println("");

        obj.remove(3);// for remove elem by index nubmer

        for (String str : obj) {
            System.out.print(str + " ");
        }
        System.out.println("");

        obj.set(1, "king"); // replace
        for (String str : obj) {
            System.out.print(str + " ");
        }
        System.out.println("");

        obj.clear();// empty array / delete all ements.
        System.out.println(obj);
    }

}
