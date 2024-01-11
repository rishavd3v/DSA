import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {12,11,13,5,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        // Insertion Sort
        // We sort the arrays in chunks. Starting from size of 2 (j=1).
        // In every iteration j is at the last index of chunk (i+1) and run till index '1'.

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else break;
                // If the above condition is not true. The loop will break. Because the rest of the array is already sorted.
            }
        }
    }
}