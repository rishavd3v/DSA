
// Ques#34 - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class firstandLast {

    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};

            ans[0] = findIndex(nums,target, true);
            if(ans[0] != -1){
                ans[1] = findIndex(nums,target, false);
            }
            return ans;
        }

        int findIndex(int[] nums, int target, boolean startIndex){
            int start = 0;
            int end = nums.length-1;
            int ans = -1;
            while(start <= end){
                int mid = start + (end-start)/2;

                if(target<nums[mid]){
                    end = mid-1;

                }else if (target>nums[mid]){
                    start = mid+1;

                }else {
                    ans = mid;
                    if (startIndex){
                        end = mid-1;
                    }else
                        start = mid+1;

                }

            }
            return ans;

        }
    }




}
