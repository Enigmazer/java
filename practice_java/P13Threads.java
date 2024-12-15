package practice_java;

class Clasa1 extends Thread{
    public void run (){
        while (true) {
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class Class2 extends Thread{
    public void run (){
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");            
        }
    }
}

public class P13Threads {
    public static void main(String[] args) {
        
        //Q1******************************************************************************************************
        // create a program to print gm and wlcm continuesly using threds

        Clasa1 th1 = new Clasa1();
        Class2 th2 = new Class2();
        th1.setPriority(8);
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());  // will print default priority
        System.out.println(th2.getState());
        th1.start();
        th2.start();
        System.out.println(th2.getState());
        System.out.println(Thread.currentThread().getState());

        //Q2******************************************************************************************************
        // add sleep method

        //Q3******************************************************************************************************
        // use set and get priority 

        //Q4******************************************************************************************************
        // get state of a thread

        //Q5******************************************************************************************************
        // refrence to current thread
    }
}
