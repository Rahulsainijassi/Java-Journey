// abstraction another example

abstract class Animal {

    void legs() {
        System.out.println(" four legs ");
    }

    abstract void eat();

    abstract void sound();

}

class Dog extends Animal {
    // @Override 
    void eat() {
        System.out.println(" dog eats meet ");
    }

    void sound() {
        System.out.println(" Bhoo.. Bhoooo.. ");
    }
}

class cow extends Animal {
    void eat() {
        System.out.println(" cow eats grass ");
    }

    void sound() {
        System.out.println(" mooooo.. moooooo.. ");
    }
}

public class abstractioncls {
    public static void main(String args[]) {
        Dog d = new Dog();
        cow c = new cow();
        d.eat();
        d.sound();
        d.legs();
        c.eat();
        c.sound();
        c.legs();

    }
}
