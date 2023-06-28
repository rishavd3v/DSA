public class BinarySearch_InfiniteArray {
    public static void main(String[] args) {
      int[] arr = {1,4,5,11,13,16,19,21,37};
      int target = 11;
        System.out.println(ans(arr, target));


    }
    // For infinite array we will search in chunks. Starting from chunk of 2 then keep doubling it.
    static int ans(int[] arr, int target){
     int start = 0;
     int end = 1;
     while(target>arr[end]){
         int newStart = end+1;
         end = end + (end-start+1)*2;
         start = newStart;
     }
     return binarySearch(arr, target,start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){


            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;

            }else if (target>arr[mid]){
                start = mid+1;

            }else {
                return mid;
            }
        }
        return -1;
    }


}

