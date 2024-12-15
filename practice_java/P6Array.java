package practice_java;
import java.util.Scanner;

    // 1d array, 2d array, jagged array and array of objects

class Students {
    int rollnum;
}

public class P6Array {
    //used for array input,printing and reverse**********************************************************************
    
    static void arch(int a){     // "int a" is a parameater here (remember its an int which is our parameater)
    a=25;
    }
    static void archg(int a[]){ // "int a[]" is a parameater here
        a[0]=25;
    }

    static void arinpt (int[] arry,int size){
        for(int i=0; i<size; i++){
            System.out.print("Enter a["+i+"] = ");
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            arry[i]= sc.nextInt();
        }
    }

    static void arinpt2d (int[][] arry,int m,int n){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            System.out.print("Enter a["+i+"]["+j+"] = ");
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            arry[i][j] = sc.nextInt();
            }
        }
    }

    static void arprt (int[] arry,int size){
        for(int i=0; i<size; i++){
            System.out.println("a["+i+"] = "+arry[i]);
        }
    }

    static void arprt2d (int[][] arry,int m,int n){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            System.out.print(arry[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void arrevrs(int[] arry,int[] revarry,int size){
            for(int i=0; i<size; i++){
                revarry[i]=arry[size-i-1];
            }
    }

    
    public static void main(String[] args) {
        
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);

        int arry[] = {1,2,3,4,5};           
        System.out.println(arry.length);

        arch(arry[0]);  // (array[0] is an argument here). Accessed the arch function
        System.out.println(arry[0]);   //**it will print 5 cause we know that the array is passed as refrence but here we passed a single value from the array which is a int(we can also pass normal int valus here like 24 for ex. ) so it will made a copy of it insted of passing as refrense
        archg(arry);  // (array is an argument here). Here we passed the array as normal, which will be passed as a refrense
        System.out.println(arry[0]);   //passed as refrence so it will cahnge the value as provided in method (method is a function that is made inside a class)
        System.out.println();

        //jagged array (in jagged array we can have constant number of rows but diffrent number of colums for every row 
        int jaaray[][] = new int[3][];    // by default the values of integer array will be 0(zero)
        jaaray[0] = new int[3];
        jaaray[1] = new int[4];
        jaaray[2] = new int[2];

        for(int i=0; i<jaaray.length; i++){
            for(int j=0; j<jaaray[i].length; j++){
                jaaray[i][j] = (int)(Math.random()*10); // this function will return a double value
            }
        }
        // for(int i=0; i<jaaray.length; i++){
        //     for(int j=0; j<jaaray[i].length; j++){
        //         System.out.print(jaaray[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // 2d/jagged array printing using for each loop
        for (int n[] : jaaray) {
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        System.out.println();

        //array of objects*********************************************************************************
        Students s1 = new Students();
        s1.rollnum = 1;
        Students s2 = new Students();
        s2.rollnum = 2;
        Students s3 = new Students();
        s3.rollnum = 3;
        Students studentarray[] = new Students[3];
        studentarray[0] = s1;
        studentarray[1] = s2;
        studentarray[2] = s3;
        // printing with for each
        // for (Students students : studentarray) {
        //     System.out.println(students.rollnum);
        // }
        // printing with normal for loop
        for(int i=0; i<studentarray.length; i++){
            System.out.println(studentarray[i].rollnum);
        }

        //Q1******************************************************************************************************
        //create a array and sum all elements 
        
        // int [] arry = new int[5];  // it's like we wrote int arry[5] in cpp(it's a one d array)
        // System.out.print("Enter arry size = ");
        // int size=sc.nextInt();
        // int[] arry = new int[size];
        // for(int i=0; i<size; i++){
        //     System.out.print("Enter a["+i+"] = ");
        //     arry[i] = sc.nextInt();
        // }
        // int total=0;
        // for(int i=0; i<size; i++){
        //     total+=arry[i];
        // }
        // System.out.print("Sum = "+total);

        //Q2******************************************************************************************************
        // find in array 

        // System.out.print("Enter arry size = ");
        // int size=sc.nextInt();
        // int[] arry = new int[size];
        // for(int i=0; i<size; i++){
        //     System.out.print("Enter a["+i+"] = ");
        //     arry[i] = sc.nextInt();
        // }
        // System.out.print("Enter The no. you wanna find = ");
        // int find=sc.nextInt();

        // for(int i=0; i<size; i++){
        //     if (arry[i]==find){
        //         System.out.print("The no. "+find+" is found at a["+i+"]");
        //         break;
        //     }
        // }

        //Q3******************************************************************************************************
        //calculate avrage marks from an array with the use of for-each loop

        // int arry[] = {1,2,3,4,5,6},sum=0;
        // for (int i=arry.length-1; i>=0; i--){ //reverse printing array using for loop
        //     System.out.println(arry[i]);
        // }
        // for (int element: arry) {
        //     System.out.println(element); // printing array using for-each loop
        // }
        // for (int element : arry) {
        //     sum+=element;
        // }
        // System.out.println("The average markes is "+(float)sum/arry.length);

        //Q4******************************************************************************************************
        // add two array's

        // int m,n;
        // System.out.print("Enter 2d array size = ");
        // m=sc.nextInt();
        // n=sc.nextInt();
        // int[][] arry = new int[m][n];
        // int[][] arry2 = new int[m][n];
        // int[][] arry3 = new int[m][n];

        // System.out.println("Enter Array 1");
        // arinpt2d(arry, m, n);
        // System.out.println("Enter Array 2");
        // arinpt2d(arry2, m, n);
        // System.out.println("Array 1");
        // arprt2d(arry,m,n);
        // System.out.println("Array 2");
        // arprt2d(arry2,m,n);
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //     arry3[i][j] = arry[i][j]+arry2[i][j];
        //     }
        // }
        // System.out.println("Array Sum");
        // arprt2d(arry3,m,n);

        //Q5******************************************************************************************************
        //reverse a array

        // the actual one (first method) // this will reverse the main array

        // int size;
        // System.out.print("Enter array size = ");
        // size=sc.nextInt();
        // int[] arry = new int[size];
        // System.out.println("Enter Array");
        // arinpt(arry, size);
        // int length = arry.length/2;
        // for(int i=0; i<length; i++){
        //     int temp=arry[i];
        //     arry[i]=arry[size-1-i];
        //     arry[size-1-i]=temp;
        // }
        // System.out.println("Reversed Array");
        // arprt(arry, size);

        //mine (second method) this will create a new reversed copy 

        // int size;
        // System.out.print("Enter array size = ");
        // size=sc.nextInt();
        // int[] arry = new int[size];
        // int[] revarry = new int[size];
        // System.out.println("Enter Array");
        // arinpt(arry, size);
        // arrevrs(arry,revarry, size);
        // System.out.println("Reversed Array");
        // arprt(revarry,size);

        //Q6******************************************************************************************************
        // find maximam element of a array 

        // int arry[] = {1,2,3,4,5,6};
        // int max = 0;
        // for(int i=0; i<arry.length; i++){
        //     if (arry[i]>max) {
        //         max=arry[i];
        //     }
        // }
        // System.out.println(max);

        //Q7******************************************************************************************************
        // find minimum element in a array

        // int arry[] = {2,3,4,5,6};
        // int max = 0;
        // for(int i=0; i<arry.length; i++){
        //     if (arry[i]>max) {
        //         max=arry[i];
        //     }
        // }
        // for(int i=0; i<arry.length; i++){
        //     if (arry[i]<max) {
        //         max=arry[i];
        //     }
        // }
        // System.out.println(max);

        //Q8******************************************************************************************************
        // find out an array is sorted or not

        // System.out.print("Enter array size = ");
        // int size = sc.nextInt();
        // int array1[] = new int[size];
        // arinpt(array1, size);
        // //int array[]=array1; //that is an pointer or refrence to the array this is not how we made a copy of an array
        // int array[] = array1.clone();  //this is a simple function to clone a array 
        // for(int i=0; i<array.length; i++){
        //     for(int j=i+1; j<array.length; j++){
        //         if (array[i]>array[j]){
        //             int temp = array[i];
        //             array[i]=array[j];
        //             array[j]=temp;
        //         }
        //     }
        // }    
        // if(array1==array){
        //     System.out.println("\nThe provided array is sorted.");
        // }else{
        //     System.out.println("\nThe provided array is not sorted.");
        //     System.out.println("Sorted array is");   
        // }
        // for(int element: array){
        //     System.out.println(element);
        // }

        
    }
}
