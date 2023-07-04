
// Ques#33 - https://leetcode.com/problems/search-in-rotated-sorted-array/

public class searchInRotated {

    class Solution {
        public int search(int[] arr, int target) {

            if(arr[0]<=arr[arr.length-1]){
                return BinarySearch(arr, target, 0, arr.length-1);
            }
            int peak = peak(arr);
            int first = BinarySearch(arr, target, 0 , peak);
            if (first != -1){
                return first;
            }
            return BinarySearch(arr, target, peak+1, arr.length-1);

        }

        int peak (int[] arr){
            int start = 0;
            int end = arr.length-1;

            while(start<end){
                int mid = start + (end-start)/2;

                if(arr[mid]>arr[start]){
                    start=mid;
                }
                else if(arr[mid]<arr[start]){
                    end = mid;
                }
                else return mid;

            }
            return -1;

        }

        int BinarySearch (int[] arr, int target, int start, int end){
            // Here we will use OrderAgnostic Binary Search because first ahlf is Ascending and second half is in descending order.

            boolean isAsc = arr[start] <= arr[end];

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



}
