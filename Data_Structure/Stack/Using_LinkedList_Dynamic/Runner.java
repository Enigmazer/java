package Data_Structure.Stack.Using_LinkedList_Dynamic;

import MyPakages.*;

public class Runner {
    public static void main(String[] args) {
        Dynamic_Stack DStack = new Dynamic_Stack();
        int option,data;
        System.out.println("----- Dynamic Stack -----");
        System.out.println("1.Push\n2.Pop\n3.Display\n0.EXIT");
        do {
            option = InputTaker.intInput("Enter = ");
            switch (option) {
                case 0:
                    System.out.println("Exiting.....");
                    break;
                case 1:
                    data = InputTaker.intInput("Enter data to push = ");
                    DStack.push(data);
                    break;
                case 2:
                    DStack.pop();
                    break;
                case 3:
                    DStack.show();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (option != 0);
    }
}