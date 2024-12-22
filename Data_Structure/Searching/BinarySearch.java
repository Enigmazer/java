package Data_Structure.Searching;

public class BinarySearch {
    static int binarySearch(int a[], int target, int start, int end){
        int mid = (start + end) / 2;
        if(start<=end){
            if(a[mid]==target){
                return mid;
            }else if(a[mid] > target){
                return binarySearch(a, target, start, mid-1);
            }else{
                return binarySearch(a, target, mid+1, end);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int a[] = {1,2,3,36,44,56,77,89,333};
        int result = binarySearch(a,89, 0,a.length-1);
        if(result!=-1){
            System.out.println("Element found at index: "+result);
        }else{
            System.out.println("Element not found.");
        }
    }
}
