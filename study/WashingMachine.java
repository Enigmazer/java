package study;

import java.util.*;
public class WashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight;
        System.out.print("Enter weight of clothes[0-7000] = ");
        weight = sc.nextInt();
        try{
        if(weight==0){
            System.out.println("Enstimated time is 0min.");
        }else if(weight>0 && weight<=2000){
            System.out.println("Estimated time is 25min.");
        }else if(weight>2000 && weight<=4000){
            System.out.println("Estimated time is 35min.");
        }else if(weight>4000 && weight<=7000){
            System.out.println("Estimated time is 45min.");
        }else if(weight>7000){
            System.out.println("OVERLODED");
        }else{
            System.out.println("Invalid input.");
        }
        sc.close();
        }catch(Exception e){
            System.out.println("Invalid input.");
        }
    }
}
