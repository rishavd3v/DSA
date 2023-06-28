public class floor {
    public static void main(String[] args) {
//      floor is the greatest number in the array which is smaller than or equal to target.
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);
    }

//    return the index of greatest number <= target
    static int floor(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
//        for floor we return end, and for ceiling we return start.
    }
}
