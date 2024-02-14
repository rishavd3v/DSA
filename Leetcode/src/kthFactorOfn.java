// Ques#1492 - https://leetcode.com/problems/the-kth-factor-of-n/
public class kthFactorOfn {
    public static void main(String[] args) {
        int n = 12;
        int k = 3;
        System.out.println(Solution.kthFactor(n,k));
    }


    class Solution {
        public static int kthFactor(int n, int k) {
            int count=0;

            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                    count++;
                    if(count==k){
                        return i;
                    }
                }
            }
            count++;
            if(count>=k){
                return n;
            }
            return -1;
        }
    }





}