import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                // above -i is used because after every iteration of i, 1 element will reach its correct position. So, we do not need to check it.
                if(arr[j-1]>arr[j]){
                    // swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}