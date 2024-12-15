package practice_java;
import java.util.Scanner;          // this class is imported for taking input

public class P1InputOutput {
    public static void main(String[] args) {

        //******************Learned about printing and taking input in java***************************

        @SuppressWarnings({ "unused", "resource"}) //used for hiding the unused and never closed warning so that the file does't look bad 
        Scanner obj = new Scanner(System.in);   //created object of class to take inputs

        // practis set 1 Q1*********************************************************************************
        // taking int input and adding numbers

        // System.out.println("Number sum");            
        // System.out.print("Enter no 1 = ");
        // int num1= obj.nextInt();            //taking an int input from user using 'nextInt()' function, from the object of scanner class 
        // System.out.print("Enter no 2 = ");
        // int num2= obj.nextInt();
        // System.out.print("Enter no 3 = ");
        // int num3= obj.nextInt();
        // int sum=num1+num2+num3;
        // System.out.println(sum);

        //ps1 Q2********************************************************************************************
        // persantage calc
        
        // int num1,num2,num3,num4,num5;
        // System.out.println("pers cal");
        // System.out.print("Enter no of sub 1 = ");
        //  num1= obj.nextInt();
        // System.out.print("Enter no of sub 2 = ");
        //  num2= obj.nextInt();
        // System.out.print("Enter no of sub 3 = ");
        //  num3= obj.nextInt();
        // System.out.print("Enter no of sub 4 = ");
        //  num4= obj.nextInt();
        // System.out.print("Enter no of sub 5 = ");
        //  num5= obj.nextInt();
        // int sum=num1+num2+num3+num4+num5;
        // float pers = sum/5f;
        // System.out.println(sum);
        // System.out.println("Persantage = " + pers);

        //ps1 Q3********************************************************************************************
        //print hello <user's name> 

        // System.out.print("Enter your name = ");
        // String name = obj.nextLine();            //taking an string line input from user using 'nextLine()' function, from the object of scanner class 
        // System.out.println("Hello " + name + " how is it going");

        //ps1 Q4*******************************************************************************************
        //change km to miles 

        // System.out.print("Enter km = ");
        //double km = obj.nextDouble();             //taking an double input from user using 'nextDouble()' function
        // // double miles = km/1.609;     //wrong
        // double miles = km*0.62137119;   //right
        // System.out.println(km + "km is equal to " + miles + " miles");

        //ps1 Q5******************************************************************************************
        //check input is int or not 
        
        // System.out.print("Enter an integer value = ");
        // System.out.println(obj.hasNextInt());    //taking an input using 'hasNextInt()' function, that will return true or false according to the input

    }
}
