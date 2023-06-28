public class MinNum_Array {
    public static void main(String[] args) {
        int[] arr = {16,14,21,84,18,17};
        System.out.println(min(arr));
        int min = arr[0];
    }
    static int min (int[]arr){
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
