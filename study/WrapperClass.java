package study;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter three values = ");
        //int a = sc.nextInt();
        Integer aobj = Integer.valueOf(sc.nextInt());  //autoboxing 
        //int b = sc.nextInt();
        Float bobj = Float.valueOf(sc.nextFloat());  //autoboxing 
        //int c = sc.nextInt();
        Double cobj = Double.valueOf(sc.nextDouble());  //autoboxing 
        double sum = aobj+bobj+cobj;  // unboxing
        System.out.printf("%.2f",sum);
        sc.close();
    }
    
}
