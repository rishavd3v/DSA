import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        // Selection Sort
        // Select the largest element from the array and put it in its correct index.
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j]>arr[maxIndex]) {
                    maxIndex = j;
                }
                // swap
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;
                // here 'arr.length-i-1' is basically the last index in every iteration.

            }
        }
    }
}
