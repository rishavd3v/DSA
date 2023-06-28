import java.util.Arrays;

public class LinearSearch_2dArr {
    public static void main(String[] args) {
        int[][] arr = {
            {21,32,11},
            {14,12,31,18},
            {41,62,35,71,88},
            {23,77,16},
        };
        int target = 71;
        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int arr[][], int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};

    }
}
