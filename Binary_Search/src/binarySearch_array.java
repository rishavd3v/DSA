public class binarySearch_array {
    public static void main(String[] args) {
        // In binary search we split the array from middle and then search for element. It can be used for sorted arrays only.
        int[] arr = {-12,-8,0,5,7,14,21,26,35,74,99};
        // Array is sorted in ascending order.
        int ans = binarySearch(arr,15);
        System.out.println(ans);

    }
    // return index of target element. -1 if target does not exist.
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // Find Mid element
            //  int mid = (start + end) / 2;     The value of mid can exceed the limit of 'Int' using this method
            // So we can use this method instead
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                // As the array is sorted in ascending order, we will now search in the left part.
                end = mid-1;
            }else if (target>arr[mid]){
                // Here we will search in right part
                start = mid+1;
            }else {
                return mid;    // required index
            }
        }
        return -1;    // target element does not exist.
    }





}
