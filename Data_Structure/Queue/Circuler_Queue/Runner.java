package Data_Structure.Queue.Circuler_Queue;

import MyPakages.*;

public class Runner {
    public static void main(String[] args) {
        Circular_Queue CQueue = new Circular_Queue();
        int option,data;
        System.out.println("----- Circular Queue -----");
        System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n0.EXIT");
        do {
            option = InputTaker.intInput("Enter = ");
            switch (option) {
                case 0:
                    System.out.println("Exiting.....");
                    break;
                case 1:
                    data = InputTaker.intInput("Enter data to insert in queue = ");
                    CQueue.enqueue(data);
                    break;
                case 2:
                    CQueue.dequque();
                    break;
                case 3:
                    CQueue.show();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (option != 0);
    }
}

