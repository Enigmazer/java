package practice_java;

import java.util.Scanner;

class ExceptionClass extends Exception {
        @Override
        public String getMessage() {
            return "Max tries reached";
        }
}

public class P14TryCatchAndThrowThrows {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        //Q1******************************************************************************************************
        // syntax, logical and runtime error

        // int a=1 --> syntax error

        // double a;
        // a = 2*2-4*3*1/2*3; //ligical error

        //  System.out.print("Enter an integer = ");   // if u give a non int input then only it will give error(runtime error)
        //  int a = sc.nextInt();
        //  System.out.println(a);

        //Q2******************************************************************************************************
        // use try catch block

        // int a=10,b;
        

        // try {
        //     b = sc.nextInt();
        //     int c= a/b;
        //     System.out.println(c);
        // } catch (ArithmeticException e) {
        //     System.out.println("ArEc");
        // } catch (Exception e){
        //     System.out.println("An error accured");
        // } 

        //Q3******************************************************************************************************

        int a[] = {1,2,3,4,5};
        int i=0;
        do{
            try {
                int b = sc.nextInt();
                System.out.println(a[b]);
                break;
            } catch (Exception e) {
                System.out.println("Arry out of bond");
                i++;
            }
        }while(i<a.length);

        if (i==5){
            // System.out.println("error");
            try {
                throw new ExceptionClass();
            } catch (Exception e){
                System.out.println(e);
            }finally{
                sc.close();
            }
        }

        //Q4******************************************************************************************************
        // add a custom exeptin in Q3

        sc.close();
    }
}
