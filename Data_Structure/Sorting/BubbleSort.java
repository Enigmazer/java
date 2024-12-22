package Data_Structure.Sorting;


// the best case time complexity of bubble sort is O(n^2) and O(n) with swapped variable
// the average case time complexity of bubble sort is O(n^2)
// the worst case time complexity of bubble sort is O(n^2)
public class BubbleSort {
    private static void bubbleSort(int a[]){
        int temp,swapped;
        for(int i=1; i<a.length; i++){
            swapped = 0;
            for(int j=0; j<a.length-i; j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = 1;
                }
            }
            if(swapped==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {6,3,5,66,3,32,2,7,8,99,3,1,34,5,45,4243,876,99};
        bubbleSort(a);
        for(int element: a){
            System.out.println(element);
        }
    }
}
