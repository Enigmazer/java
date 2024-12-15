package practice_java;

abstract class Pen{     // abstract classes can extends normal classes too 
    Pen(){
        System.out.println("I am a pen");
    }
    abstract void write ();
    abstract void refill (int a);
}
class FountainPen extends Pen{
    FountainPen(){
        System.out.println("I am a FountainPen pen");
    }
    public void write(){
        System.out.println("I write in blue color");
    }
    public void refill(int a){
        System.out.println("Refilling FountainPen pen");
    }
}

interface BasicAnimalInterface {
    public void eat();
    public void sleep();
    public void walk();
}
class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}
class Human extends Monkey implements BasicAnimalInterface {
    public void jump(){
        System.out.println("Human jumping");
    }
    public void eat(){
        System.out.println("Human eating");
    }
    public void sleep(){
        System.out.println("Human sleeping");
    }
    public void walk(){
        System.out.println("Human walking");
    }
    public void run(){
        System.out.println("Human runing");
    }
}

interface TvRemote {
    public void changeChhanel(int a);
    public void volumUp();
    public void volumDown();
}
interface SmartTvRemote extends TvRemote {
    public void chngeMode();
    public void search(String a);
}
class Tv implements SmartTvRemote {
    public void changeChhanel(int a){
        System.out.println("Changing chanel to no. "+a);
    }
    public void volumUp(){
        System.out.println("Incresing volume");
    }
    public void volumDown(){
        System.out.println("Decresing volume");
    }
    public void chngeMode(){
        System.out.println("Changing videao input mode to HDMI");
    }
    public void search(String s){
        System.out.println("Searching for : "+s);
    }
}

public class P11AbstractClassAndInterfaces {
    public static void main(String[] args) {
        
        //Q1******************************************************************************************************
        // abstract class pen with methods like write and refill

        //Q2******************************************************************************************************
        //use the abstract class from Q1 and make concreat class named fountainpen with a additional method
    
        // FountainPen fountpen = new FountainPen();
        // fountpen.write();
        // fountpen.refill(10);

        //Q3******************************************************************************************************
        // a class which inherit monkey class and implement BasicAnimalInterface

        // Human man = new Human();
        // man.eat();
        // man.bite();
        // man.walk();
        // man.jump();
        // man.run();
        // man.sleep();

        //Q5******************************************************************************************************
        //demonstrate polymorphism using monkey class

        // Monkey obj = new Human(); // making obj of class human but using the refrence of class monkey so we can only use or access the methods of monkey class
        // obj.bite();
        // obj.jump();
        // // obj.eat(); --> give error cause it's a human class method
        // BasicAnimalInterface Addy = new Human(); // we can also use the refrence of interfaces
        // Addy.eat();
        // Addy.sleep();
        // // Addy.run(); --> give error cause it's a human class method

        //Q6******************************************************************************************************
        // interface which inherit another interface

        //Q7******************************************************************************************************
        // creat a concret class from Q6
        
        // Tv tv = new Tv();
        // tv.changeChhanel(8);
        // tv.volumUp();
        // tv.volumDown();
        // tv.chngeMode();
        // tv.search("s");
    
        //Q*******************************************************************************************************
        // use a class from same package
        
        // a obj = new a();   // using class "a" from practset10 program which is in same package
        // obj.a = 20;      
        // System.out.println(obj.a);
    
    }
}
