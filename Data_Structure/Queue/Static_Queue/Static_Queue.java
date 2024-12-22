package Data_Structure.Queue.Static_Queue;

public class Static_Queue {
    int SQueue[] = new int[5];
    int f = -1, r = -1;

    public void enqueue(int data){
        if(r >= 4){
            System.out.println("Unable to isert data Error : Queue is full.");
            return;
        }
        if (f == -1) {
            f = 0;
        }
        r++;
        SQueue[r] = data;
    }

    public void dequque(){
        if(r == -1 && f == -1){
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Removed element is = "+SQueue[f]);
        if (f == r) {
            f = -1;
            r = -1;
            return;
        }
        f++;
    }

    public void show(){
        if(r == -1 && f == -1){
            System.out.println("Queue is empty.");
            return;
        }

        for(int i = f; i <= r; i++){
            System.out.println("Element : "+SQueue[i]);
        }
    }
}
