package practice_java;
// import java.util.Scanner;

class gas{
    private int a;

    public int getter(){
        return a;
    }
    public void satter(int a){
        this.a=a;
    }
}
class gas2{
    private int a;

    public int getter(){
        return a;
    }
    public gas2(int a){
        this.a=a;
    }
}
class gas3{
    private int a;

    public int getter(){
        return a;
    }
    public gas3(){
        this.a=2;
    }
    public gas3(int a){
        this.a=a;
    }
}
public class P9GettersAndSetters {
    public static void main(String[] args) {
        
        //Q1******************************************************************************************************
        //creat a calss and use gatters and satters

        gas obj = new gas();
        obj.satter(7);
        int a = obj.getter();
        System.out.println(a);

        //Q3******************************************************************************************************
        // use constructer with one

        gas2 obj2 = new gas2(5);
        System.out.println(obj2.getter());

        //Q4******************************************************************************************************
        // overload constructer 

        gas3 obj3 = new gas3();
        System.out.println(obj3.getter());
        gas3 obj1 = new gas3(3);
        System.out.println(obj1.getter());
    
    }
}
