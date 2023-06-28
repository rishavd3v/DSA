import java.util.Arrays;

public class ArraysSwap {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,9};
        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap (int[] arr, int a,int b){
        int temp = a;
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
