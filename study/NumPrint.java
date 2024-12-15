package study;

public class NumPrint {
    public static void main(String[] args) {
        int arr[] = new int[25];
        int k=0;
        while (k<25) {
            for(int j=1; j<50; j++){
                if (j%2!=0) {
                    arr[k]=j;
                    k++;
                }
            }
        }
        for(int i=0; i<25; i++){
            if (arr[i]%3==0 && arr[i]%5==0) {
                arr[i]=0;
            }
        }
        for(int i=0; i<25; i++){
            System.out.println(arr[i]);
        }
        
    }
}
