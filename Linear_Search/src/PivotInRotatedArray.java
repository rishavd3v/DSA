public class PivotInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int[] arr1 = {1,3};
        System.out.println(findPivot(arr1));
        // Pivot is the point from where the array is rotated.
        // Basically Pivot is the greatest value of Array.

    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[start]){
                start=mid;
            }
            else if(arr[mid]<arr[start]){
                end=mid;
            }
            else return mid;
        }
        return -1;
    }
}
