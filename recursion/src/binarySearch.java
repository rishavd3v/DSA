public class binarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9};
        int start = 0;
        int end = arr.length-1;
        int target = 5;


        int ans = search(arr,start,end,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int start,int end, int target){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target<arr[mid]){
            end = mid-1;
            return search(arr,start,end,target);
        }
        start = mid+1;
        return search(arr,start,end,target);

    }
}
