package Data_Structure.Queue.Static_Queue;

import MyPakages.*;

public class Runner {
    public static void main(String[] args) {
        Static_Queue SQueue = new Static_Queue();
        int option,data;
        System.out.println("----- Static Queue -----");
        System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n0.EXIT");
        do {
            option = InputTaker.intInput("Enter = ");
            switch (option) {
                case 0:
                    System.out.println("Exiting.....");
                    break;
                case 1:
                    data = InputTaker.intInput("Enter data to insert in queue = ");
                    SQueue.enqueue(data);
                    break;
                case 2:
                    SQueue.dequque();
                    break;
                case 3:
                    SQueue.show();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (option != 0);
    }
}
