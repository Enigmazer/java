package Data_Structure.Stack.Using_Array_Static;

import MyPakages.*;

public class Runner {
    public static void main(String[] args) {
        Static_Stack sStack = new Static_Stack();
        int option,data;
        System.out.println("----- Static Stack -----");
        System.out.println("1.Push\n2.Pop\n3.Display\n0.EXIT");
        do {
            option = InputTaker.intInput("Enter = ");
            switch (option) {
                case 0:
                    System.out.println("Exiting.....");
                    break;
                case 1:
                    data = InputTaker.intInput("Enter data to push = ");
                    sStack.push(data);
                    break;
                case 2:
                    sStack.pop();
                    break;
                case 3:
                    sStack.show();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (option != 0);
    }
}