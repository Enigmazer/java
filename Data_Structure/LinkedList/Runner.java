package Data_Structure.LinkedList;

import MyPakages.*;

public class Runner {
    public static void main (String[] args){
        int option,data,idx;
        LinkedList list = new LinkedList();
        list.menu();
        do{
            option = InputTaker.intInput("Enter option(6 for menu) = ");
            switch(option){
                case 0:
                    System.out.println("Exiting.....");
                    break;
                case 1:
                    data = InputTaker.intInput("Enter data for insertion at First = ");
                    list.insertF(data);
                    break;
                case 2:
                    idx = InputTaker.intInput("Enter index where you want to insert = ");
                    data = InputTaker.intInput("Enter data for insertion at index "+idx+" = ");
                    list.insertAt(idx, data);
                    break;
                case 3:
                    data = InputTaker.intInput("Enter data for insertion at Last = ");
                    list.insertL(data);
                    break;
                case 4:
                    idx = InputTaker.intInput("Enter index of data you want to Delete = ");
                    list.delete(idx);
                    break;
                case 5:
                    list.showList();
                    break;
                case 6:
                    list.menu();
                    break;
                default:
                    System.out.println("Invalid Input.");
            }
        }while(option != 0);
    }
}
