package practice_java;

import java.util.Scanner;

public class P4ConditionalStatements {
    public static void main(String[] args) {
        // ****************Lerned about conditional statmanents (if/else and switch)*************************

        @SuppressWarnings({ "resource", "unused" })
        Scanner obj = new Scanner(System.in);

        //Q1*************************************************************************************************
        
        // int a=10;
        // if (a=10) {     // it will give error cause we used assignment '=' operator instead of comparizon '==' operator
        //     System.out.println("a=10");
        // }

        //Q2*************************************************************************************************
        //pass or fail

        // int sub1,sub2,sub3;
        // System.out.print("Enter numbers of all three subjects = ");
        // sub1=obj.nextInt();
        // sub2=obj.nextInt();
        // sub3=obj.nextInt();

        // float avg=(sub1+sub2+sub3)/3f;

        // if (sub1>=33 && sub2>=33 && sub3>=33 && avg>=40) {
        //     System.out.println("Pass. persantage = "+avg);
        // }else{
        //     System.out.println("Fail. persantage = "+avg);
        // }

        //Q3*************************************************************************************************
        //how much tax
        
        // System.out.print("Enter your salary = ");
        // int salary = obj.nextInt();
        // float tax;
        // if (salary>=250000 && salary<500000) {
        //     tax=(salary*5f)/100;
        //     System.out.println("Your tax is "+tax+"rs");
        // }else if(salary<1000000 && salary>=500000){
        //     tax=(salary*20f)/100;
        //     System.out.println("Your tax is "+tax+"rs");
        // }else if(salary>=1000000){
        //     tax=(salary*30f)/100;
        //     System.out.println("Your tax is "+tax+"rs");
        // }else{
        //     System.out.println("You dont have to pay any tax");
        // }

        //Q4*************************************************************************************************
        //print days of week

        // System.out.print("Enter no. = ");
        // byte day = obj.nextByte();

        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Satrday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Out of range");
        // }

        //Q5*************************************************************************************************
        //leap year 
        
        // System.out.println("Enter year = ");
        // int year = obj.nextInt();
        // if (year%4==0){
        //     System.out.println("The year "+year+" is a leap year");
        // }else{
        //     System.out.println("Year "+year+"is not an leap year");
        // }

        //Q6**************************************************************************************************
        //find the type of website

        // System.out.print("Past link here = ");
        // String link = obj.nextLine();

        // if (link.indexOf(".com")>-1) {
        //     System.out.println("It's an Commercial website (.com)");
        // }else if (link.indexOf(".org")>-1) {
        //     System.out.println("It's an Organization website (.org)");
        // }else if (link.indexOf(".in")>-1) {
        //     System.out.println("It's an Indian website (.in)");
        // }else{
        //     System.out.println("unsupported domain type");
        // }
    }
}
