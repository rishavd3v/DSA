import java.util.ArrayList;
import java.util.List;

// Ques#448 - https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class allNumberDisappeared {


    class Solution {
        public List<Integer> findDisappearedNumbers(int[] arr) {
            int i = 0;
            while(i<arr.length){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else{
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (i = 0; i < arr.length; i++) {
                if(arr[i]!= i+1){
                    ans.add(i+1);
                }
            }
            return ans;
        }
    }



}
