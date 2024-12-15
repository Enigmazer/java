package Games;

import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    static void rpc(int a){
        if(a==1){
            System.out.println("PC : Rock");
        }else if(a==2){
            System.out.println("PC : Paper");
        }else{
            System.out.println("PC : Scissor");
        }
    }
    static void wl(int a){
        if(a==1){
            System.out.println("Tie");
        }else if(a==2){
            System.out.println("You won");
        }else{
            System.out.println("You loose");
        }
    }
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Random rndm = new Random();
        System.out.print("Enter your name = ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "\n\tThis are your instructions for the game");
        int input;
        do {
            System.out.print("\n1 for Rock\n2 for Paper\n3 for Scissor\n4 for Exit\nEnter = ");
            input = sc.nextInt();
            int Randomnumber = rndm.nextInt(3) + 1;  /* formula used to gentate random no. between a range =[ rndm(object name).nextInt((max-min)+1)+min; ] if we simplyfie it more than we can just write rndm.nextInt(3) + 1; in our case */
            switch (input) {
                case 1:
                    System.out.println(name +" : Rock");
                    rpc(Randomnumber);
                    if (1 == Randomnumber) {
                        wl(1);
                    } else if (2 == Randomnumber) {
                        wl(3);
                    } else {
                        wl(2);
                    }
                    break;
                case 2:
                    System.out.println(name +" : Paper");
                    rpc(Randomnumber);
                    if (1 == Randomnumber) {
                        wl(2);
                    } else if (2 == Randomnumber) {
                        wl(1);
                    } else {
                        wl(3);
                    }
                    break;
                case 3:
                    System.out.println(name +" : Scissor ");
                    rpc(Randomnumber);
                    if (1 == Randomnumber) {
                        wl(3);
                    } else if (2 == Randomnumber) {
                        wl(2);
                    } else {
                        wl(1);
                    }
                    break;
                case 4:
                    System.out.println("\nEXIT\n\t ----- Thanks for playing ----- \n");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (input != 4);
    }
}
