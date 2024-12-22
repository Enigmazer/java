package Data_Structure.Sorting;

// the best case time complexity of selection sort is O(n^2)
// the average case time complexity of selection sort is O(n^2)
// the worst case time complexity of selection sort is O(n^2)
public class SelectionSort {
    static void selectionSort(int a[]){
        int min,temp;
        for(int i=0; i<a.length-1; i++){
            min=i;
            for(int j=i+1; j<a.length; j++){
                if(a[min] > a[j]){
                    min=j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = {6,3,5,66,3,32,2,7,8,99,3,1,34,5,45,4243,876,99};
        selectionSort(a);
        for(int element: a){
            System.out.println(element);
        }
    }
}
