package practice_java;
        // also learn about super keyword here
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}


class a{
    int a;
    a(){
        System.out.println("i am a default constructer of class a");
        a=5;
    }
    a(int a){
        System.out.println("i am a parametarized constructer of class a");
        this.a=a;
    }
}
class b extends a{
    int b,c;
    //this class will run the default constructer of class
    public void setb(int b){
        this.b=b;
    }
    public int getb(){
        return c=a*b;
    }
}
class c extends b {
    int d;
    public int getc(){
        return d=a+b;
    }
}
class e extends a{
    int b,e;

    e(int b,int m){
        super(m);   //used super keyword mean it will call the parent class parametarized constructer first, m is our argument here(used name - "m" to clear confusion) 
        this.b=b;
    }
    public int gete(){
        return e=a-b;
    }
}

        // multiple inheritan
    interface ifs1  {
        void walk();    
    }
    interface ifs2  {
        void run(int a);    
    }
    class mic implements ifs1,ifs2{
        public void walk(){
            System.out.println("Walking.....");
        }
        public void run(int a){
            System.out.println("Runnning....\nSpeed = "+a);
        }
    }

public class P10InheritanceAndDynamicMethDispatch {
    public static void main(String[] args) {

        //dynamic method dispatch*******************************************************************************

            // // Phone obj = new Phone(); // Allowed
            // // SmartPhone smobj = new SmartPhone(); // Allowed
    
            // Phone obj = new SmartPhone(); // Yes it is allowed
            // // SmartPhone obj2 = new Phone(); // Not allowed
    
            // obj.showTime();
            // obj.on();
            // // obj.music(); Not Allowed
    
    

            Phone obj = new Phone(); 
            obj.on(); // call Phone class on method
            obj.showTime();
            obj = new SmartPhone();   // now the link is broken and obj is pointing to smartphone object(obj type is still phone)
            obj.on(); // call SmartPhone class on method
            obj.showTime();
            // // obj.music(); Not Allowed
        
        //Q1******************************************************************************************************
        // use inheritence     (b to a)
        
        // b obj = new b();
        // obj.setb(10);
        // System.out.println(obj.getb());

        //Q******************************************************************************************************
        // heararchical inheritance  (e and b to a)

        // e obj = new e(3,5);
        // System.out.println(obj.gete());
        // b obj1 = new b();
        // obj1.setb(3);
        // System.out.println(obj1.getb());


        //Q******************************************************************************************************
        // use mulilevel inheritence     (c to b to a)

        // c obj = new c();
        // obj.setb(10);
        // System.out.println(obj.getb());
        // System.out.println(obj.getc());

        //Q******************************************************************************************************
        // hybrid inheritance       (c to b to a , e to a)
        
        // c obj = new c();
        // e obj1 = new e(3,5);
        // obj.setb(3);
        // System.out.println(obj.getb());
        // System.out.println(obj.getc());
        // System.out.println(obj1.gete());

        //Q******************************************************************************************************
        // multiple inheritance

        // mic obj = new mic();
        // obj.walk();
        // obj.run(10);

    }
}
