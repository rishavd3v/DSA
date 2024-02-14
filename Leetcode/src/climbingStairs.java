// Ques - 60 https://leetcode.com/problems/climbing-stairs/description/
import java.util.*;

public class climbingStairs {
    public static void main(String[] args) {

    }

    class Solution {
        public int climbStairs(int n) {
            int sum = 0;
            int a = 1;
            int b = 2;
            if(n==1){
                return 1;
            }
            if(n==2){
                return 2;
            }
            for(int i=0;i<n-2;i++){
                sum = a+b;
                a = b;
                b = sum;
            }
            return sum;
        }
    }


}
