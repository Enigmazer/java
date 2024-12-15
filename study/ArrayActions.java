package study;

import java.util.Scanner;

public class ArrayActions {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcom to the world of Array :");
        System.out.print("Enter the size of the array :-");
        int size = sc.nextInt();
        int ar[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element number "+i+". =");
            ar[i]=sc.nextInt();
        }
        System.out.println("1. Traversal\n2.Find element\n3.Update value\n4.EXIT");
        int option;
    do{
        System.out.println("Select operations option :-");
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Element are :-");
                for(int i=0; i<size; i++){
                    System.out.println(ar[i]);
                }
            break;
            case 2:
                System.out.println("Enter the element you want to find = ");
                int find = sc.nextInt();
                int c = 0;
                for(int i=0; i<size; i++){
                    if (ar[i] == find ){
                        System.out.println("Element found at index = "+i);
                        c++;
                        break;
                    }
                }
                if(c == 0){
                    System.out.println("Didn't found the element in array");
                }
            break;
            case 3:
                System.out.print("Enter the index of tne value you want to replace = ");
                int idx = sc.nextInt();
                System.out.print("Enter new value = ");
                int repls = sc.nextInt();
                ar[idx] = repls;
            break;
            case 4:
                System.out.println("Exiting.....");
            break;
            default:
                System.out.println("Invalid option");    
            break;
        }
        }while(option!=4);
        sc.close();
    }
}
