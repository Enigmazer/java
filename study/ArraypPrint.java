package study;

import java.util.Scanner;

public class ArraypPrint {
    public static void main(String[] args) {
        int size;
        System.out.print("Enter the length of array = ");//login@123
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter elment "+i+"= ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number to check : ");
        int cc=0,c = sc.nextInt();

        for(int i=0; i<size; i++){
            if(arr[i]>c){
                System.out.println(arr[i]);
            cc++;
            }
        }
        if (cc==0) {
            System.out.println("No element found bigger than "+c);
        }
    }
    
}
