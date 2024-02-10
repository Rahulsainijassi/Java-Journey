// here this keyword refers to current object inside a method or funcion (address of boject) 

class thiscoinm {
    thiscoinm(){
        System.out.println(this);// same
    }
    public static void main(String args[]) {
        thiscoinm obj = new thiscoinm();
        System.out.println(obj);//same
    }
}