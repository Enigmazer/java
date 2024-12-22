package Data_Structure.Searching;

public class LinearSearch {
    static int linearSearch(int[] a, int target){
        for(int i=0; i<a.length; i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {2,4,1,3,8,9,6,7};
        int result = linearSearch(a,8);
        if(result!=-1){
            System.out.println("Element is found at index: "+result);
        }else{
            System.out.println("Element not found.");
        }
    }    
}
