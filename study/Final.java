package study;

// final - variable, method and class

final class Calc{   // we cant inherit this class
        public void show(){
            System.out.println("In Calc show");
        }
}
// class AdCalc extends Calc {  // we can't extend a final class
// }

class A{   
    public final void show(){       // we can't override this method
        System.out.println("In A show");
    }
}
class B extends A{  
    // public void show(){          // can not override a final method so it will give error
    //     System.out.println("In A show");
    // }
}

public class Final {
    public static void main(String[] args) {
         final int NUM = 8;
        //  NUM = 9; // give error we can't change value of final variable
        System.out.println(NUM);
    }
}
