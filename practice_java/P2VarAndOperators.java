package practice_java;
import java.util.Scanner;

@SuppressWarnings("unused") //used for hiding the unused warning

public class P2VarAndOperators {
    public static void main(String[] args) {

        //**********Learned about increment/decriment about variables in java and operator precedence**************
        
        // ternary operators (?:) ***********************************************************************

        int n = 10;
        boolean evnorodd;
        // int intresult = n%2==0 ? 1 : 0;     
        String result = n%2==0 ? "even" : "odd";    // it's like if-else if true set to even else set to odd
        // String result = n%2<=0 ? "Ngative number" : n%2==0 ? "even" : "odd";  // can use for multiple conditions too
        System.out.println("result = " + result);

        
        //quick quize************************************************************************************
        //solve  1.x-y/2   2.b^2-4ac/2a   3.v^2-u^2    4.a*b-d

        // int x=1,y=6;
        // System.out.println(x-y/2);        // 1-6/2 = -2

        // float b=2,a=3,c=1;
        // System.out.println( (b*b-4*a*c)/(2*a) );   // 2*2-4*3*1/2*3 = -1.3333334

        // float v=2,u=2;
        // System.out.println(v*v-u*u);         // 2*2-2*2 = 0

        // System.out.println(a*b-c);         // 3*2-1 = 5

        //quick quize**************************************************************************************
        
        // int y=7,x;
        // x= ++y*8;    // ++y mean first increment and then use(++ have more presidens than *) so x= 8*8 = 64
        // System.out.println(x);

        // char ch = 'c';
        // System.out.println(++ch);  //it will print d. and it will print "{" affter z not "a"
        
        //Q1******************************************************************************************************
        //result for 7/4*9/2

        // float ansr = 7/4f*(9/2f);    // dividing an int by int couse a logical error and give wrong output so we add 'f' to make a vlaue float and then it will give the right ans = 7.875
        // System.out.print(ansr);

        //Q2*****************************************************************************************************
        //encript your grade by adding 8 to it 

        // char grade = 'b';
        // //encripting
        // grade = (char)(grade+8);     // using type conversion so we dont get an int value (cause char+int = int)
        // System.out.println(grade);
        // //decripting
        // grade = (char)(grade-8);
        // System.out.println(grade);

        //Q3******************************************************************************************************
        //given no. is greater than the input or not

        // int a=10,b;
        // Scanner obj = new Scanner(System.in);
        // System.out.print("Enter a number greater than 10 = ");
        // b = obj.nextInt();
        // System.out.println(a<b);      //used '<' comparizon operator so it will return true or false

        //Q4****************************************************************************************************
        //write v^2-u^2/2as in java

        // int v=2,u=2,a=2,s=2;
        // System.out.println((v*v-u*u)/(2*a*s));  // 2*2-2*2/2*2*2 = 0

        //Q5******************************************************************************************************
        
        // int x=7;
        // int a=x*49/x+35/x;
        // System.out.println(a);        //answer is 54
    }
}
