package Data_Structure.LinkedList;

public class LinkedList {
    Node head;

    // function to access/print main menu 
    public void menu(){
        System.out.println("----- Linked List -----");
        System.out.println("1.Insert at First\n2.Insert Anywere\n3.Insert at Last\n4.Delete\n5.Show list\n0.EXIT");
    }
    // function to insert data at first or head
    public void insertF(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // function to insert data at a index 
    public void insertAt(int idx, int data){
        if(idx==0){
            insertF(data);
        }else{
            if(head == null){
                System.out.println("Unable to insert data at index "+idx+" Error: Index Out of Bound.");
                return;
            }
            int i=1;
            Node temp = head;
            while (i<idx && temp.next != null) {
                temp = temp.next;
                i++;
            }
            if(i != idx){
                System.out.println("Unable to insert data at index "+idx+" Error: Index Out of Bound.");
                return;
            }
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
        }
    }

    // functoin to insert data at end or tail
    public void insertL(int data){
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

    // function to delete element from linked list
    public void delete(int idx){
        Node temp;
        if(idx == 0){
            temp = head;
            System.out.println("Data deleted is : "+temp.data);
            head = temp.next;
            temp = null;    // pointing it to null for memory menagment 
        }else{
            if(head == null){
                System.out.println("Unable to delete data at index "+idx+" Error: Index Out of Bound.");
                return;
            }
            int i=1;
            temp = head;
            while (i < idx && temp.next != null) {
                temp = temp.next;
                i++;
            }
            if(i!=idx || temp.next == null){
                System.out.println("Unable to delete data at index "+idx+" Error: Index Out of Bound.");
                return;
            }
            Node temp2 = temp.next;
            System.out.println("Data deleted is : "+temp2.data);
            temp.next = temp2.next;     // or temp.next.next;
            temp2 = null;
        }
    }

    // function to iterate list
    public void showList(){
        if(head==null){
            System.out.println("List is empty.");
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
