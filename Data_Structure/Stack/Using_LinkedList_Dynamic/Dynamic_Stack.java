package Data_Structure.Stack.Using_LinkedList_Dynamic;

import Data_Structure.LinkedList.Node;
public class Dynamic_Stack {
    Node head;

    public void push(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void pop(){
        if(head == null){
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = head;
        System.out.println("Popped element is : " + temp.data);
        head = temp.next;
        temp = null;
    }

    public void show(){
        if(head == null){
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.println("Element : " + temp.data);
            temp = temp.next;
        }
        System.out.println("Element : " + temp.data);
    }

}
