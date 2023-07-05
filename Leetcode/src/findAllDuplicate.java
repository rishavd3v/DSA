import java.util.ArrayList;
import java.util.List;


//Ques#442 - https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class findAllDuplicate {


    class Solution {
        public List<Integer> findDuplicates(int[] arr) {

            int i=0;
            while(i<arr.length){
                int correct = arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else{
                    i++;
                }
            }

            List<Integer> ans = new ArrayList<>();
            for(i=0;i<arr.length;i++){
                if(arr[i] != i+1){
                    ans.add(arr[i]);
                }
            }
            return ans;
        }

        static void swap(int[]arr,int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }

    }



}
