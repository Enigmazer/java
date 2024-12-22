package Data_Structure.Queue.Dynamic_Queue;

import MyPakages.*;

public class Runner {
    public static void main(String[] args) {
        Dynamic_Queue DQueue = new Dynamic_Queue();
        int option,data;
        System.out.println("----- Dynamic Queue -----");
        System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n0.EXIT");
        do {
            option = InputTaker.intInput("Enter = ");
            switch (option) {
                case 0:
                    System.out.println("Exiting.....");
                    break;
                case 1:
                    data = InputTaker.intInput("Enter data to insert in queue = ");
                    DQueue.enqueue(data);
                    break;
                case 2:
                    DQueue.dequque();
                    break;
                case 3:
                    DQueue.show();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (option != 0);
    }
}

