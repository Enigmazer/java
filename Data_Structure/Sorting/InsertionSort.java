package Data_Structure.Sorting;

// the best case time complexity of insertion sort is O(n^2)
// the average case time complexity of insertion sort is O(n^2)
// the worst case time complexity of insertion sort is O(n^2)
public class InsertionSort {
    static void insertionSort(int a[]){
        int key,j;
        for(int i=1; i<a.length; i++){
            key=a[i];
            j=i-1;
            while (j>=0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int a[] = {6,3,5,66,3,32,2,7,8,99,3,1,34,5,45,4243,876,99};
        insertionSort(a);
        for(int element: a){
            System.out.println(element);
        }
    }
}
