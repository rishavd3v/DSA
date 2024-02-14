// Ques#1239 - https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/description/
import java.util.ArrayList;
import java.util.Arrays;

public class subarrayMinimums{
    public static void main(String[] args) {
        String[] bank = {"000","111","000"};
        int[] arr = {3,1,2,4};


    }


    class Solution {
        public static final int mod = 1_000_000_007;
        public int sumSubarrayMins(int[] arr) {
            int n = arr.length;
            long sum = 0;
            for(int i=0;i<n;i++){
                sum = (sum+min(arr,i))%mod;

            }
            return (int)sum;
        }
        static int min(int[] arr,int i){
            int min = arr[i];
            int ans = 0;
            for(int k=i;k<arr.length;k++){
                min = Math.min(min,arr[k]);
                ans += min;
            }
            return ans;
        }
    }




}