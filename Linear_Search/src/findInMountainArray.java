// Ques - https://leetcode.com/problems/find-in-mountain-array/
// First we will find peak Element of Array
// Then we will first search in first half and then in second half
public class findInMountainArray {
    public static void main(String[] args) {

    }

    static int search (int[] arr, int target){
        int peak = peakOfMountainArray(arr);
        int firstTry = BinarySearch(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        return BinarySearch(arr, target, peak+1, arr.length-1);
    }

    // To search for peak element
    static int peakOfMountainArray (int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start = mid+1;
            }

        }
        return start;

    }

    // To search element in array
    static int BinarySearch (int[] arr, int target, int start, int end){
        // Here we will use OrderAgnostic Binary Search because first half is Ascending and second half is in descending order.

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