package sorting;

import java.util.Scanner;

public class quicksort {
    public static int partition(int ar[],int low ,int high){
        int pivot = ar[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(ar[j]<pivot){
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        int temp = ar[i+1];
        ar[i+1] = ar[high];
        ar[high] = temp;
        return i+1;
    }
    public static void quicksortfunc(int ar[],int low,int high){

        if(low<high){
            int pvix = partition(ar,low,high);
            quicksortfunc(ar,low,pvix-1);
            quicksortfunc(ar,pvix+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter array size = ");
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter element "+i+" = ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        quicksortfunc(arr,0,size-1);

        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
