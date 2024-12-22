package Data_Structure.Queue.Dynamic_Queue;

import Data_Structure.LinkedList.Node;
public class Dynamic_Queue {
    Node head;
    public void enqueue(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void dequque() {
        if(head == null){
            System.out.println("Queue is empty.");
            return;
        }
        Node temp;
        temp = head;
        System.out.println("Data deleted is : "+temp.data);
        head = temp.next;
        temp = null;    // pointing it to null for memory menagment 
    }

    public void show(){
        if(head==null){
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = head;
        int i=0;
        while (temp.next != null) {
            System.out.println("Element "+i+" : "+temp.data);
            temp = temp.next;
            i++;
        }
        System.out.println("Element "+i+" : "+temp.data);
    }
    
}
