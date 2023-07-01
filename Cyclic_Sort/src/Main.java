import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void cyclic(int[] arr){
        // Cyclic Sort
        // Used when a range of no. is given.
        // Since the number in arrays are consecutive, the correct index of any element will be 'element-1'.
        // For eg: In an unsorted array, starting from no. '7'. If the array is sorted no. '7' will be at index '6' and no. '8' will be at index '7' and so on.
        // i.e. nth element will be at (n-1)th index.

         int i = 0;
         while(i<arr.length){
             int correctIndex = arr[i]-1;  // index at which the element should be.
             if(arr[i] != arr[correctIndex]){  // check if the element is equal to the element at correct index. If not, swap.
                 // swap
                 int temp = arr[i];
                 arr[i] = arr[correctIndex];
                 arr[correctIndex] = temp;
                }
             else {
                 i++;
             }
        }
    }
}