package Data_Structure.Queue.Circuler_Queue;

public class Circular_Queue {
    int maxSize = 5;
    int CQueue[] = new int[maxSize];
    int f = -1, r = -1;

    public void enqueue(int data){
        if((r+1)%maxSize == f){
            System.out.println("Unable to isert data Error : Queue is full.");
            return;
        }
        if (f == -1) {
            f = 0;
        }
        r = (r+1)%maxSize;
        CQueue[r] = data;
    }

    public void dequque(){
        if(f == -1){
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Removed element is = "+CQueue[f]);
        if (f == r) {
            f = -1;
            r = -1;
            return;
        }
        f = (f+1)%maxSize;
    }

    public void show(){
        if(f == -1){
            System.out.println("Queue is empty.");
            return;
        }
        int i=f;
        while (i != r) {
            System.out.println("Element : "+CQueue[i]);
            i = (i+1)%maxSize;
        }    
        System.out.println("Element : "+CQueue[i]);
    }
}
