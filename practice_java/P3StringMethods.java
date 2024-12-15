package practice_java;

import java.util.Scanner;

@SuppressWarnings("unused") //used for suppresing/hiding unused warning 

public class P3StringMethods {
    public static void main(String[] args) {

        //******************** Learned about string methods and the diffrent ways of printing in java ******************
        
        // differnt ways to print in java************************************************************************
        // int a=10;
        // float b=2.86f;
        // System.out.println("Hello");  // it will print a new line at the end
        // System.out.print("Hello");  // it will not print a new line at end
        // System.out.printf("\nA is = %d ans B is %f",a,b); //it is same as we used in c languageg (%d is for int, %f is for float, %c is for char and %s is for string)
        // System.out.printf("\nA is = %d ans B is %8.3f",a,b); //it will print 3 decimals at last and take 8 spaces for the whole no. 
        // System.out.format("\nA is = %d ans B is %f",a,b); //it is same as printf 


        //string buffer(buffer is safe builder is not)******************************************************************************************

        StringBuffer sb = new StringBuffer("Arun");
        System.out.println(sb.capacity());  // default capacity of 16 (to reduce the reallocation of string)
        System.out.println(sb.length()); // default 0
        sb.append(" Dangi");    // we have many more methodes in it
        System.out.println(sb.capacity());
        System.out.println(sb);
        // String s = sb; // give error cause cante convert directly
        String s = sb.toString();


        //string methods*****************************************************************************************
        //strings are immutable (un changable)

        String name = "Arun"; //this will create a string 
        String name1 = "Arun"; // diffrent refrance variable name but will point to same location in string constant pool
        name = name + " Dangi"; // this looks like we are changing the string but na what is actualy happening here is it will create a new object(string) and point our refrence variable to that new location

        // String name = " Eddy ";     //0=' ', 1='E', 2='d', 3='d', 4='y', 5=' '
        // int lenth = name.length(); //it will return the length of string which is 6 (for eg. a[6] goes from a[0] to a[5])
        // System.out.println(lenth); 
        // String lname = name.toLowerCase(); // it will change all the charecters to lower case (Q1)
        // System.out.println(lname);
        // String uname = name.toUpperCase(); // it will cahnge all the charecters to UPPER case 
        // System.out.println(uname); 
        // String tname = name.trim(); // it will remove all the spaces from the string
        // System.out.println(tname); 
        // String sbname = name.substring(2); // it will return the remaining string from the indexing
        // System.out.println(sbname); 
        // String nsbname = name.substring(1,5); // it will return the whole srting starting from index 1 to ending on index 4 
        // System.out.println(nsbname); 
        // String rname = name.replace('d','r'); // it will replace all the d with r in the string (Q2)
        // System.out.println(rname); 
        // String nrname = name.replace("d","ry"); // it will replace all the d with ry in the string (always use " for this, it will not work with ')
        // System.out.println(nrname);
        // String onrname = name.replace("ddy","ra"); // it will replace all the ddy with ra in the string (always use " for this, it will not work with ')
        // System.out.println(onrname);
        // System.out.println(name.startsWith("Ed")); //it will check that th srting is starting from the 'Ed' or not and then return true or false(ans is false cause it's stsrting from " Ed")
        // System.out.println(name.endsWith("y ")); //it will check that th srting is ending on 'y ' or not and then return true or false(ans is true cause it's ending on "y ")
        // System.out.println(name.charAt(1)); //it will return the charecter on this index (will print 'E')
        // System.out.println(name.indexOf('d')); //it will return the index where 'd' is accuring first time in the string (return '-1' if not found)
        // System.out.println(name.indexOf('d',3)); //it will return the index where 'd' is accuring first time in the string after index 2(return '-1' if not found)
        // System.out.println(name.lastIndexOf('d')); //it will return the index where 'd' is accuring last time in the string (return '-1' if not found)
        // System.out.println(name.lastIndexOf('d',2)); //it will return the index where 'd' is accuring last time in the string before index 3 (return '-1' if not found)
        // System.out.println(name.equals(" Eddy ")); //it will check that the srting is equal to ' Eddy ' or not and then return true or false(ans is true)
        // System.out.println(name.equalsIgnoreCase(" eDdy ")); //it will check that the srting is equal to ' eddy ' (while ignoring case) or not and then return true or false(ans is true)
        // System.out.println("Hello \" "); //we used a '\' here to print " cause we cant directly print a "
        
    
        //Q3*****************************************************************************************************
        //write Hello <name>, how your day is going

        // System.out.print("What's your name? - ");
        // Scanner obj = new Scanner(System.in);
        // String name = obj.nextLine();
        // System.out.println("Hello "+ name + ", how your day is going");


        //Q4*****************************************************************************************************
        //detect double and triple spaces in string 

        // String sentence = "Hello  user ";
        // System.out.println(sentence.indexOf("  ")); //if ans is -1 then didn't found
        // System.out.println(sentence.indexOf("   "));

        //Q5 was about some simple formating that uses \n and \t*************************************************  
    
    }
}
