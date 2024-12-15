package study;

abstract class AIC {
    abstract void show();
    // we can also have all not abstract methods in an abstract class too
}
public class AbstractAninmsInrClass {
    public static void main(String[] args) {
        AIC obj = new AIC() {
            @Override
            void show() {
                System.out.println("In new show");
            }
            // we can provide implimentation of another methods 
            // too if we have more than one abstract methods
        };
        /* if we want to implement the abstract class or interface only once 
        then we can use anonums inner class */
        // here it is not creating the object of AIC but of anonums inner class
        obj.show();
    }
}
