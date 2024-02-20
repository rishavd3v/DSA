import java.util.Arrays;

public class roug{
    public static void main(String[] args) {
        int [] arr = {0,5,6,1,0,9};
        int n = arr.length;
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
    }
    static void selectionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int maxIndex = 0;
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    static void bubbleSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j < n-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}