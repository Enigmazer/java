package study;

class Anonms {
    public Anonms(){
        System.out.println("A's constructore");
    }
    public void show(){
        System.out.println("In A show");
    }
}

// every time we say new it will create a new object 
public class AnonymousObject {
    public static void main(String[] args) {
        new Anonms();    // created a object
        new Anonms().show();    // will create new object 
        // we cant use this object again if we want
    }
}
