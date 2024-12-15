package study;

// thread and lambda expression

// class A1 extends Thread{
//     @Override
//     public void run() {
//         for(int i=1; i<16; i++){
//             System.out.println(i);
//         try{
//             sleep(1000);
//         } catch (Exception e) {
//             System.out.println("Sleeping...");
//         }
//         }
//     }
// }
// class B1 implements Runnable{
//     @Override
//     public void run() {
//         for(int i=1; i<16; i++){
//             System.out.println("B");
//         try{
//             Thread.sleep(1000);
//         } catch (Exception e) {
//             System.out.println("Sleeping...");
//         }
//         }
//     }
// }
// public class ThreadOP {
//     public static void main(String[] args) throws Exception{
//         A1 objA = new A1();
//         objA.start();
//         B1 objB = new B1();
//         Thread objThread = new Thread(objB);
//         objThread.start();
//     }
// }


// Race conditions in thread

class count{
    int count;
    public synchronized void increment(){   /*synchronized mean only one thread can access this 
                                            method at a time. Before doing this if both thread reached the method at 
                                            same time then the value will increment only one time like
                                            from 3 to 4 instead of two times mean 3 to 4 and 4 to 5*/
        count++;
    }
} 
public class ThreadOP {
    public static void main(String[] args) throws InterruptedException {
        count cobj = new count();
        Runnable obj1 = () -> {     /*   '->' this is called lambda expressoin(it's used 
                                    to make the code shorter) and here we are making an object of 
                                    anonymous class using the refrence of runnable interface*/
            for(int i=1; i<=10000; i++){
                cobj.increment();
            }
        };   
        Runnable obj2 = () -> {
            for(int i=1; i<=10000; i++){
                cobj.increment();
            }
        };  

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();  // join is a method that allows your main thread to wait for the other threads to come back and join
        t2.join();  // if dont do this then it will start the threads and continue the execution of the remaining code

        System.out.println(cobj.count);
    }
}