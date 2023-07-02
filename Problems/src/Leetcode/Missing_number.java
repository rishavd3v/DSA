package Leetcode;
// Ques#268 - https://leetcode.com/problems/missing-number/
// Done using cyclic sort

public class Missing_number {
    public static void main(String[] args) {
        int[] arr = {0,3,2};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(correctIndex>arr.length-1){
                i++;
            }
            else if(arr[i]!=arr[correctIndex]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;

    }
}
