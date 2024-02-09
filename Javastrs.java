public class Javastrs {
    public static void main(String args[]) {
        // String str = "king";// simple str
        // // String str2 = "king"; //now both are equal but.......
        // String str2 = new String("king");// now both are not equal -> new object
        // string
        // System.out.println((str == str2) ? "both are equla" : "both are not
        // equal");// not equla
        // System.out.println((str.equals(str2)) ? "both are equla" : "both are not
        // equal");// is equla

        // immutable string matalab if we concate anything in string then we need to
        // save in another string var ex...
        String name = "Rahul";
        name.concat(" saini");// will not workd because strings is immutable
        System.out.println(name);//not worked
        // now
        String name2 = name.concat(" Saini");//it will work
        System.out.println(name2);// yes working

    }
}
