package study;

import java.util.Scanner;

public class ArrayActions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the world of array :");
        int option,size;
        
        do{ 
        System.out.println("Choose which type of array you want to create : \n1.Int \n2.Char\n3.Float\n4.Exit");
        option = sc.nextInt();
        System.out.print("Enter array size = ");
        size = sc.nextInt();
            switch (option) {
                case 1:
                   int ar[] = new int[size];
                   for(int i=0; i<size; i++){
                    System.out.print("Enter element number "+i+". =");
                    ar[i]=sc.nextInt();
                }
                   System.out.println("1. Traversal\n2.Find element\n3.Update value\n4.EXIT");
                    int options;
                do{
                    System.out.print("Select operations option :-");
                    options = sc.nextInt();
                    switch (options) {
                        case 1:
                            System.out.println("Element are :-");
                            for(int i=0; i<size; i++){
                            System.out.println(ar[i]);
                            }
                        break;
                        case 2:
                            System.out.println("Enter the element you want to find = ");
                            int find = sc.nextInt();
                            for(int i=0; i<size; i++){
                                if (ar[i] == find ){
                                    System.out.println("Element found at index = "+i);
                                    break;
                                }
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
                            System.out.println("Returning to main menu");
                        break;
                        default:
                            System.out.println("Invalid option");    
                        break;
                    }
                }while(options!=4);
                break;
                case 2:
                    char arc[] = new char[size];
                    for(int i=0; i<size; i++){
                        System.out.print("Enter element number "+i+". =");
                        arc[i]=sc.next().charAt(0);
                    }
                       System.out.println("1. Traversal\n2.Find element\n3.Update value\n4.EXIT");
                        int optionsc;
                    do{
                        System.out.print("Select operations option :-");
                        optionsc = sc.nextInt();
                        switch (optionsc) {
                            case 1:
                                System.out.println("Element are :-");
                                for(int i=0; i<size; i++){
                                System.out.println(arc[i]);
                                }
                            break;
                            case 2:
                                System.out.println("Enter the element you want to find = ");
                                char find = sc.next().charAt(0);
                                for(int i=0; i<size; i++){
                                    if (arc[i] == find ){
                                        System.out.println("Element found at index = "+i);
                                        break;
                                    }
                                }
                                
                            break;
                            case 3:
                                System.out.print("Enter the index of tne value you want to replace = ");
                                int idx = sc.nextInt();
                                System.out.print("Enter new value = ");
                                char repls = sc.next().charAt(0);
                                arc[idx] = repls;
                            break;
                            case 4:
                                System.out.println("Returning to main menu");
                            break;
                            default:
                                System.out.println("Invalid option");    
                            break;
                        }
                    }while(optionsc!=4);
                break;
                case 3:
                    float arf[] = new float[size];
                    for(int i=0; i<size; i++){
                        System.out.print("Enter element number "+i+". =");
                        arf[i]=sc.nextFloat();
                    }
                       System.out.println("1. Traversal\n2.Find element\n3.Update value\n4.EXIT");
                        int optionsf;
                    do{
                        System.out.print("Select operations option :-");
                        optionsf = sc.nextInt();
                        switch (optionsf) {
                            case 1:
                                System.out.println("Element are :-");
                                for(int i=0; i<size; i++){
                                System.out.println(arf[i]);
                                }
                            break;
                            case 2:
                                System.out.println("Enter the element you want to find = ");
                                float find = sc.nextFloat();
                                for(int i=0; i<size; i++){
                                    if (arf[i] == find ){
                                        System.out.println("Element found at index = "+i);
                                        break;
                                    }
                                }
                                
                            break;
                            case 3:
                                System.out.print("Enter the index of tne value you want to replace = ");
                                int idx = sc.nextInt();
                                System.out.print("Enter new value = ");
                                float repls = sc.nextFloat();
                                arf[idx] = repls;
                            break;
                            case 4:
                                System.out.println("Returning to main menu");
                            break;
                            default:
                                System.out.println("Invalid option");    
                            break;
                        }
                    }while(optionsf!=4);
                break;
                case 4:
                    System.out.println("EXITING......");
                break;
                default:
                    System.out.println("invalid option");
                break;
            }}while (option!=4);
        sc.close();
    }
}