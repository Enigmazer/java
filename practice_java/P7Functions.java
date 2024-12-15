package practice_java;
import java.util.Scanner;
public class P7Functions {
    //used for confusion clearing


    static void table(int n){
        for(int i=1; i<11; i++){
        System.out.println(n+"x"+i+" = "+n*i);
        }
    }

    static void pattern(){
        for(int i=1; i<6; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=5; i>1; i--){
            for(int j=i; j>1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //mine
    // static int recsumn(int sum,int num,int n){
    //     sum+=num;
    //     if(n==1){
    //         return sum;
    //     }
    //     return recsumn(sum,num+1,n-1);
    // }
    //actual
    static int recsumn(int n){
        if(n==1){
            return 1;
        }
        return n + recsumn(n-1);
    }

    static int fibbo(int a, int b, int c){
        int sum;
        sum=a+b;
        a=b;
        b=sum;
        System.out.println(sum);
        if(c==3){
            return 0; 
        }
        return fibbo(a,b,c-1);
    }

    static float avr(int ...a){
        int sum=0;
        for (int element: a) {
            sum+=element;
        }
        return (float)sum/a.length;
    }

    static int ftoc(int f){
        return (f-32)*5/9;
    }

    static int rpattern(int n){
        for(int i=1; i<=n; i++){
        System.out.print("* ");
        }
        System.out.println();
        if (n==0) {
            return 0;
        }
        return rpattern(n-1);
    }
    static void rpattern2(int n){
        if(n>0){
            rpattern2(n-1);
        for(int i=1; i<=n; i++){
        System.out.print("* ");
        }}
        System.out.println();
    }
    public static void main(String[] args) {
        
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);

        //Q1******************************************************************************************************
        // funtion to print multiplication table

        // System.out.print("Enter no. you want table of = ");
        // int n = sc.nextInt();
        // table(n);

        //Q2&Q4***************************************************************************************************
        //write a function to print star pattern
        
        //pattern();

        //Q3******************************************************************************************************
        //print sum of first n natural no.'s using recursive function

        // System.out.print("How many first natural numbers sum you want = ");
        // int n=sc.nextInt();
        // //int sum = recsumn(0,1,n);
        // int sum = recsumn(n);
        // System.out.println(sum);

        //Q5******************************************************************************************************
        //fibbonachi series using recursive function

        // System.out.print("Enter first and second no. and the term till you want to print fibbonachi series = ");
        // int fn=sc.nextInt(),sn=sc.nextInt(),trm=sc.nextInt();
        // System.out.println(fn+"\n"+sn);
        // fibbo(fn,sn,trm);

        //Q6******************************************************************************************************
        //function of average of set number passed as argument 

        // System.out.println("average = "+avr(2,3,4,5,4,3,1,6));
        // System.out.println("average = "+avr(2,3,5,4,3,1,6));

        //Q7&Q8******************************************************************************************************
        //star pattern using recursion

        // System.out.print("How many lines you want = ");
        // int lines = sc.nextInt();
        // rpattern(lines);
        // rpattern2(lines);

        //Q9******************************************************************************************************
        //function to convert f to c

        // System.out.print("Enter temprature = ");
        // int temp = sc.nextInt();
        // System.out.println(temp+"f is equal to "+ftoc(temp)+"c");

        //Q10******************************************************************************************************
        // Q3 using iterative approach

        // System.out.print("How many first natural numbers sum you want = ");
        // int n=sc.nextInt(),sum=0;
        // for(int i=1; i<=n; i++){
        //     sum+=i;
        // }
        // System.out.println(sum);

    
    }
}
