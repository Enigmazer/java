package Data_Structure.Stack.Using_Array_Static;

public class Static_Stack {

    int SStack[] = new int[5];
    int top = -1;
    // to insert data
    public void push(int data){
        if(top >= 4){
            System.out.println("Stack is full.");
            return;
        }
        top++;
        SStack[top] = data;
    }

    // to delete or pop data
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Popped element is : "+SStack[top]);
        top--;
    }

    // to display stack
    public void show(){
        if(top == -1){
            System.out.println("Stack is empty.");
            return;
        }
        for(int i = top; i>=0; i--) {
            System.out.println("Element : "+SStack[i]);
        }
    }
}
