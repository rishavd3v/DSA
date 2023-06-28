public class ceilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,19};
        int target = 3;

        //Q: Print the smallest element greater than equal than target.(i.e element next to target element if target does not exist)

        System.out.println(ceiling(arr, target));


    }
    // Print smallest element greater than or equal to target. Using Binary Search.
    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        // If target is the greatest element in the array. Then there will be no answer.
        if(target>arr[arr.length]){
            return -1;
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                return arr[mid];
            }

        }
        return arr[start];
        // When the while loop will break. Start pointer will be at the element just greater than target.
    }



}
