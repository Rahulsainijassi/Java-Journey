//interface is like a class which contains only abstract methods - by default becams public and abstract methods 
// by default variables - public static and final (final means constant you can't cahange var values)
// note:-remembers keywords-> infterface and impliments
interface vehicle {
    String name = "thaar";// public static final
    int speed = 300;// public static final

    static void show() { // we can make define static method not simple method because it automatically
                         // became abstract methode
        System.out.println("this is har");
    }

    void start();// public + abstract

    void stop();// public + abstract
}

class customer implements vehicle {
    @Override
    public void start() {
        System.out.println("move the key and strars");
    }

    public void stop() {
        System.out.println("press clitch and break");
    }
}

public class absinterface {
    public static void main(String args[]) {
        // accessing without for chack static....
        System.out.println(vehicle.name);
        System.out.println("speed is " + vehicle.speed);
        vehicle.show();
        // through obj
        customer obj = new customer();
        obj.start();
        obj.stop();

    }
}
