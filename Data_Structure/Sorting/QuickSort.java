package Data_Structure.Sorting;

// the best case time complexity of quick sort is O(n logn)
// the average case time complexity of quick sort is O(n logn)
// the worst case time complexity of quick sort is O(n^2)


// remember the thing that the array is not actually getting divided we are just performing the action on a sub part of it  
public class QuickSort {
    static int partition(int a[],int low, int high){
        int pivot = a[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            if(a[j]<pivot){                 // a[j] > pivot for decending order
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }    
        }
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }
    static void quickSort(int a[],int low, int high){
        if(low<high){
            int pivot = partition(a, low, high);
            quickSort(a, low, pivot-1);
            quickSort(a, pivot+1, high);
        }
    }
    public static void main(String[] args) {
        int a[] = {6,3,5,66,3,32,2,7,8,99,3,1,34,5,45,4243,876,99};
        quickSort(a,0,a.length-1);
        for(int element: a){
            System.out.println(element);
        }
    }
}
