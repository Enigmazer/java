package practice_java;
import java.util.Scanner;

class Employee {
    int id,salary;
    String name;

    public int salary(){
        return salary;
    }
    public void getname(){
        System.out.println(name);
    }
    public void setname(String n){
        name=n;
    }
}

class phone1 {
    public void ring(){
        System.out.println("ringing......");
    }
    public void vibrt(){
        System.out.println("vibration......"); 
    }
    public void slnt(){
        System.out.println("silent......");
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("hitting......");
    }
    public void run(){
        System.out.println("runing......");
    }
    public void shoot(){
        System.out.println("shooting......");
    }
}
public class P8Class {
        static int sum (int ...a){         //it's like we wrote int a[]
        int sum=0;
        for(int element:a){
            sum += element;
        }
        return sum;
        }

    public static void main(String[] args) {
        
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);

        //confusion clearing------------*important****************************************************************
       
        //funtion overloding (work as same as cpp but here we used a differn method)
        //our parameater is a (...a) array so we send all argumet as normal and it will just made an array of all those argument        
        
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2,3,4,5));

        //Q1******************************************************************************************************
        //employee class

        // Employee obj = new Employee();
        // obj.id=1;
        // obj.salary=20000;
        // obj.name="Peter";
        // int salary=obj.salary();
        // System.out.println("Salary = "+salary);
        // System.out.print("Old name = ");
        // obj.getname();
        // System.out.print("New name = ");
        // obj.setname("Tony");
        // obj.getname();

        //Q2******************************************************************************************************
        //class to print "ringing and vibrating"

        // phone1 pobj = new phone1();
        // pobj.ring();
        // pobj.vibrt();
        // pobj.slnt();

        //Q5******************************************************************************************************
        //class named TommyVecetti capabal of hitting, running and shooting
        
        // System.out.print("1 for hit \n2 for run \n3 shooting \nEnetr = ");
        // //char action = sc.next().charAt(0); //there is no 'nextChar()' function in java for char input so we write 'sc.next().charAt(0)'  next() function return the next token/word in the input as a string and charAt(0) function returns the first character in that string
        // TommyVecetti tvobj = new TommyVecetti(); 
        // int action;  //think why we did'n used char
        // do{
        // action = sc.nextInt();
        // switch (action) {
        //     case 1:
        //         tvobj.hit();
        //         break;
        //     case 2:
        //         tvobj.run();
        //         break;
        //     case 3:
        //         tvobj.shoot();
        //         break;
        //     case 4:
        //         System.out.println("EXIT");
        //         break;
        //     default:
        //         System.out.println("Invalid input");
        //         break;
        // }}while(action != 4);
    }
}
