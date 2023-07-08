// Ques#645 - https://leetcode.com/problems/set-mismatch/
public class setMismatch {

    class Solution {
        public int[] findErrorNums(int[] nums) {
            int i=0;
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }
                else{
                    i++;
                }
            }
            for(i=0;i<nums.length;i++){
                if(nums[i]!=i+1){
                    return new int[]{nums[i],i+1};
                }
            }
            return new int[] {-1,-1};
        }
        void swap(int arr[],int a,int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }


}
