package study;

class AUC{
    public void showA(){
        System.out.println("In AUC show");
    }
}
class BUC extends AUC{
    public void showB(){
        System.out.println("In BUC show");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        // A obj = new B();    
        AUC obj = (AUC) new BUC();    // this is called upcasting and it happens imlicitly so no need to do this
        obj.showA();
        // obj.show1();     //unaccesible
        
        BUC obj1 = (BUC) obj;       // here we are doing downcasting (can also say doing type conversion)
        obj.showA();
        obj1.showB();
    }
}
