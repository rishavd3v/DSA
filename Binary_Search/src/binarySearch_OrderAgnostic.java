public class binarySearch_OrderAgnostic {
    public static void main(String[] args) {
        // When we dont know if Array is sorted in Ascending order or descending order.
        int[] arr = {-12,-8,0,5,7,14,21,26,35,74,99};
        int ans = orderAgnostic(arr,99);
        System.out.println(ans);
    }
    static int orderAgnostic (int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // Find whether array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else if (target>arr[mid]){
                    start = mid+1;
                }else {
                    return mid;
                }
            }
            else {
                if(target>arr[mid]){
                    end = mid-1;
                }else if (target<arr[mid]){
                    start = mid+1;
                }else {
                    return mid;
                }
            }

        }
        return -1;
    }
}
