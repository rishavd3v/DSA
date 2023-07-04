
//Ques#704 - https://leetcode.com/problems/binary-search/

public class binarySearch {

    class Solution {
        public int search(int[] arr, int target) {
            int start = 0;
            int end = arr.length-1;

            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]>target){
                    end = mid-1;
                }
                else if(arr[mid]<target){
                    start = mid+1;
                }
                else return mid;

            }
            return -1;

        }
    }




}
