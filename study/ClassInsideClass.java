package study;

class AC{
    int age;
    public void show(){
    System.out.println("in show");
    }
    class B{
        public void config(){
        System.out.println("in config");
        }
    }
}
public class ClassInsideClass {
    public static void main(String[] args) {
        AC obj = new AC();
        obj.show();

        AC.B obj1 = obj.new B();    // to create object of inner class 
        // we first need the object of outer class to create object of inner class
        // we can make inner class static also and if we make it static then we can access it without creating object of outer class
        // like this ->     AC.B obj1 = new A.B();
        obj1.config();
    }
}
