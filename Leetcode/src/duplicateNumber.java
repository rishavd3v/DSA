
//Ques#287 - https://leetcode.com/problems/find-the-duplicate-number/

public class duplicateNumber {

// Solution #1
    class Solution {
        public int findDuplicate(int[] arr) {
            int i=0;
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
            return arr[arr.length-1];
        }
    }

// Solution #2
    class Solution2 {
        public int findDuplicate(int[] arr) {
            int i=0;
            while(i<arr.length){
                if(arr[i] != i+1){
                    int correct = arr[i]-1;
                    if(arr[i] != arr[correct]){
                        //swap
                        int temp = arr[i];
                        arr[i] = arr[correct];
                        arr[correct] = temp;
                    }
                    else{
                        return arr[i];
                    }
                }
                else{
                    i++;
                }
            }
            return -1;
        }
    }




}
